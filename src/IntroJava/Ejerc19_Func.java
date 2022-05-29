/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc19_Func {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         
        String tipodecambio;
        int num;
        
        
        System.out.println("Elija la opcion (Dolar, Yenes, libras");
        tipodecambio = leer.nextLine();
        System.out.println("ingrese el monto en euros: ");
        num= leer.nextInt();
        
          cambiomoneda(num, tipodecambio);               
        
    }

    public static void cambiomoneda(int num, String tipodecambio) {
        double dolar=0;
        double yenes=0;
        
       
        switch (tipodecambio) {
            case "dolar":
                dolar = 1.28611 * num;
                System.out.println("Dolar: " + dolar);
                break;
            case "yenes":
                System.out.println("Yenes: " + yenes);
                yenes = 129.852 * num;
                break;
            case "libras":
                System.out.println("libras: " + num*0.86);
                break; 
    }
    }

}
    

