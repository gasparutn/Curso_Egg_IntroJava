/*
 * Crear un programa que dado un numero determine si es par o impar.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc07_Cond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero entero:");
        num = leer.nextInt();
        
         if(num % 2 == 0){
            
            System.out.println("Es par");
                   
        }else{
            
            System.out.println("Es impar");
       
    }
    } 
}
