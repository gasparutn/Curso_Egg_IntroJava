/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
   solicite números al usuario hasta que la suma de los números introducidos supere el
   límite inicial. 
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc13_Buble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int valor, num;
        int i;
        System.out.println("ingrese un valor limite positivo:");
        valor = leer.nextInt();
        i = 0;
        do {
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            i += num;

        } while (valor >= i);
        System.out.println("valor limite superado");
    }     
    
    }