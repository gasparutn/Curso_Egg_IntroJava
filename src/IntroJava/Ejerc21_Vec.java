/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
   pida al usuario un numero a buscar en el vector. El programa mostrará donde se
   encuentra el numero y si se encuentra repetido
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc21_Vec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vector[];
        vector = new int[20];
        int num = 0;

        for (int i = 0; i <= 19; i++) {
            vector[i] = (int) (Math.random() * 9 + 1);
            System.out.println("arreglo " + i + " ----> " + vector[i]);

        }

        System.out.println(" ingrese el numero que desea encontrar en el vector: ");
        num = leer.nextInt();
        int cont = 0;
        for (int i = 0; i <= 19; i++) {
            if (vector[i] == num) {
                cont = cont + 1;
               
                
                System.out.println(" el numero se encontro en el arreglo: " + i);
            }
            

        }
            if(cont>=2) {
                System.out.println(" el numero se encontro: "+cont+" veces");
            }
    }

}
