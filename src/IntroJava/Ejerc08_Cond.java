/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc08_Cond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String frase1;
       String frase2;
       frase1= "eureka";
       frase2= "eureka";
       System.out.println("ingrese una frase:");
        frase1 = leer.nextLine();
        
       if(frase1.equals(frase2)) {
        System.out.println("es correcto");
    }else { 
            System.out.println("es incorrecto");
            }
       
        }
    
}
