/*
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
   si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
   * * * *
   *     *
   *     *
   * * * *
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc17_Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("ingrese un numero: ");
        n = leer.nextInt();

        if (n >= 0 && n <= 20) {
            for(int i = 0; i < n; i++) {
                System.out.print("*");
                System.out.print("");
            }
            System.out.println();

            for (int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                
                }
                System.out.println("*");
            }
                for(int i = 0; i < n; i++) {
                System.out.print("*");
    }
        }else  {
            System.out.println(" error, El numero a ingresar es de 1 a 20");
               
            }
    }
}

