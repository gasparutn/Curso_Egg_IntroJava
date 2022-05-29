
import java.util.Scanner;

/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */

/**
 *
 * @author gaspa
 */
public class Ejerc25_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       Scanner sc = new Scanner(System.in);
        boolean resultado;
        int matriz[][],N,M, suma1, suma2, auxsuma = 0, i, j;
        N = 3;
        M = 3;
        matriz = new int[N][M];
        
        System.out.println("Ingrese numeros del 1 al 9 ");
        System.out.println("Llenar matriz:");
        for(i = 0 ; i < N ; i++){
            for(j = 0 ; j < M ; j++){
                do{
                    System.out.print(String.format("matriz[%d][%d] = ", i,j));
                    matriz[i][j] = sc.nextInt();
                    if (matriz[i][j] < 1 || matriz[i][j] > 9)
                        System.out.println("ERROR. Numeros entre 1 y 9");
                } while(matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }
        resultado = true;
        i = 0;
        
        System.out.println("Matriz ingresada:");
        mostrarMatriz(matriz,N,M);
        // Sumo filas con columnas
        while(resultado && i < N){
            j = 0;
            suma1 = 0;
            suma2 = 0;
                  
            while(resultado && j < M){
                suma1 += matriz[i][j];
                suma2 += matriz[j][i];
                j++;
            }
            if (suma1 == suma2){
                if (i == 0){
                    auxsuma = suma1;  
                } else {
                    if (auxsuma != suma1)
                        resultado = false;
                }
            } else {
                resultado = false;
            }
            i++;
        }
        
        suma1 = 0;
        suma2 = 0;
        if (resultado){
            for(i = 0 ; i < N ; i++){
                suma1 += matriz[i][i];
                suma2 += matriz[N-1-i][i];
            }
            if (suma1 == suma2){
                if (suma1 != auxsuma)
                    resultado = false;
            } else {
                resultado = false;
            }
        }
        
        if (resultado){
            System.out.println("Es un cuadrado magico! Todos sus lados suman " + auxsuma);
        } else
            System.out.println("No es un cuadrado magico!");
    }
    
    public static void mostrarMatriz(int[][] matriz, int N, int M){
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){
                System.out.print(String.format("%3d ", matriz[i][j]));
                if (j == M-1){
                    System.out.print("\n");
                }
            }
        }
    }
}
 
    
    

