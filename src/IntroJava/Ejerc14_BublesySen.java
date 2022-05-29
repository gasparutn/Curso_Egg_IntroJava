/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc14_BublesySen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, num, suma;
        suma = 0;
        for (i = 1; i <= 20; i++) {
            System.out.println("ingrese 20 numeros");
            num = leer.nextInt();
            if (num == 0) {
                System.out.println("Se capturó el numero cero");
                break;

            } else if (num >= 1) {
                suma = suma + num;
            }
           
        }
        System.out.println("el valor es: "+suma);
    }
}