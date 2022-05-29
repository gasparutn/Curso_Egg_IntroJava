/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
 la nota se pedirá de nuevo hasta que la nota sea correcta. 
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc12_Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        
        do {
            System.out.println("ingrese un nota del 0 a 10:");
            nota = leer.nextInt();
             
       }while (!(nota >=0 && nota<=10));
           System.out.println("LA NOTA ES CORRECTA"); 
    }   
}     
        
