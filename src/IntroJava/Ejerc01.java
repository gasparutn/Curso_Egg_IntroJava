/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJava;

import java.util.Scanner;

        
/**
 *
 * Gaspar
 */

public class Ejerc01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingresenumeros = new Scanner(System.in); 
                
        System.out.println("Bienvenido, ingrese el primer numero.");
        int num1;
        num1 = ingresenumeros.nextByte();
        
        System.out.println("Bienvenido, ingrese el segundo numero.");
        int num2;
        num2 = ingresenumeros.nextByte();
        int suma;
        suma = num1 + num2;
        System.out.println("la suma de los dos numeros es: "+suma);
        
         
       
    }
      

    
}
