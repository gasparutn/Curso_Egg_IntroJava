/*
 * Implementar un programa que dado dos números enteros determine cuál es el
   mayor y lo muestre por pantalla.
 
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc06_Cond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
       System.out.println("ingrese el primer numero:");
        int num1; 
        num1 = leer.nextByte();
        
        System.out.println("ingrese el segundo numero:");
        int num2;
        num2 = leer.nextByte(); 
        
        if(num1>num2){    
        System.out.println("El numero mayor es:"+num1);
        } else {
            System.out.println("El numero mayor es:"+num2);
        }    
        
    }
        
    }