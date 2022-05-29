package javaapplication1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gaspa
 */
public class Ejerc15_BucleJavi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Por favor, ingrese el primer numero.");
        double num1 = teclado.nextDouble();
        System.out.println("Por favor, ingrese el segundo numero.");
        double num2 = teclado.nextDouble();
        if (num1>0 && num2>0){
            byte opc;
                do { //ACA VA UN WHILE y en el if de abajo la condicion contraria.
                System.out.println("****** MENU ******");
                System.out.println("**** 1.SUMAR *****");
                System.out.println("****2.RESTAR******");
                System.out.println("***3.MULTIPLICAR**");
                System.out.println("*****4.DIVIDIR****");
                System.out.println("*****5.SALIR******");
                System.out.println("ELIJA LA OPCION:  ");
                opc = teclado.nextByte();
                switch (opc){
                    case 1:
                        System.out.println("El valor de la suma es = " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("El valor de la resta es = " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("El valor de la multiplicacion es = " + (num1*num2));
                        break;
                    case 4:
                        System.out.println("El valor de la division es = " + (num1/num2));
                        break;
                    case 5:
                       System.out.println("Esta seguro que desea salir del programa? [S/N]");
                       String opc2 = teclado.next();
                        if (opc2.equals("S")) {
                            opc = 6;
                        } else if (opc2.equals("N")) {
                            opc = 5;
                                }
                        break;
                }
                } while (opc <= 5 && opc >= 1);
            }else{
                System.out.println("Al menos uno de los numeros ingresados no es positivo. Intentelo nuevamente.");
            }
    }
    }
    

