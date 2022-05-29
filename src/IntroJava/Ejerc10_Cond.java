/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc10_Cond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    String frase;
      String subfrase;
      
      System.out.println("ingrese frase: ");
      frase = leer.nextLine();
     subfrase=frase.substring(0,1);
        if(subfrase.equals("a")){
        System.out.println("CORRECTO");
    }else {
            System.out.println("INCORRECTO");
    }
    
    }       
    }
