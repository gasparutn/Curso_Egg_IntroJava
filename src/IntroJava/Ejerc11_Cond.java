/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc11_Cond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int tipomotor;
        System.out.println("SEGUN EL TIPO DE MOTOR QUE POSEA INGRESE UN VALOR DEL 1 AL 4:");
        tipomotor = leer.nextInt();

        if (tipomotor >= 1 && tipomotor <= 5) {

            switch (tipomotor) {
                case 1:
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2:
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("La bomba es una bomba de hormigón");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;

            }
        } else if (tipomotor < 0) {
            System.out.println("No existe un valor válido para tipo de bomba");
        }

    }
}
