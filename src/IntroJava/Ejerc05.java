/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla
   el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
   Math.sqrt().
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero:");
        int num;
        num = leer.nextByte();
        
        int sum = 0;         
        int doble = num * 2;
        int triple = num * 3;
        
        System.out.println("el doble del numero es:"+doble);
        System.out.println("el triple del numero es:"+triple);
        System.out.println(Math.sqrt(num));
        
             
        
        
        
        
              
         
    
    }
    
}
