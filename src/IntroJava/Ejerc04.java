/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
   grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
              
        System.out.println("ingrese la temperatura actual en centigrados:");
        double cen = leer.nextDouble();
                   
        double fahren = (9* cen)/5;        
        System.out.println("el equivalente en fahrenheit es "+fahren);
        
    }
    
}
