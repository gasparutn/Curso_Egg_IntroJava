/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz.
 */
package javaapplication1;

 

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author gaspa
 */
public class Ejerc23_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    Random ale = new Random();   
    int[][] mat= new int[4] [4]; 
    
    for(int i=0 ; i < 4; i++){
       for(int j=0 ; j < 4; j++){
       mat[i][j]= ale.nextInt(99-10+1)+10;
               
        }
    }
    System.out.println(" \n");        
   
    String imp=""; 
    
    for(int i=0 ; i < 4; i++){
      for(int j=0 ; j < 4; j++){
     imp= imp+"| "+mat[i][j];                
        
    }
     imp= imp+" |\n";
    }System.out.println(imp);
    
    
   System.out.println(" La matriz transpuesta es:"); 
    int aux;
    for(int i=0 ; i < 4 ; i++){
        for(int j=0 ; j < i ; j++){
            aux= mat[i][j];
            mat[i][j] = mat[j][i];
            mat [j][i] = aux;
      }
     
    }

    for(int i=0 ; i < 4 ; i++){
        for(int j=0 ; j < 4 ; j++){
        System.out.print("|"+mat[i][j]+"| ");   
        }
        System.out.println(" ");
    }
}
}