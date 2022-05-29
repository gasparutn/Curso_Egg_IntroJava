/*
 * Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc15_Bluces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1, num2, suma, resta, multiplicar, dividir;
        int menu;

        suma = 0;
        resta = 0;
        multiplicar = 0;
        dividir = 0;
        
        String salir;
        int aux; 
        aux=1;
        System.out.println("ingrese un numero entero:");
        num1 = leer.nextInt();
        System.out.println("ingrese otro numero entero");
        num2 = leer.nextInt();

        while (aux==1) {
            
            
            System.out.println("elije una opcion");

            System.out.println("1)Suma");
            System.out.println("2)Resta");
            System.out.println("3)Multiplicacion");
            System.out.println("4)Dividir");
            System.out.println("5)Salir");

          
            menu = leer.nextInt();
            if (menu<1 && menu>5){
            do { 
            System.out.println(" El menu es del 1 al 5 idiota");
            System.out.println("elije una opcion");
            System.out.println("1)Suma");
            System.out.println("2)Resta");
            System.out.println("3)Multiplicacion");
            System.out.println("4)Dividir");
            System.out.println("5)Salir");
            menu = leer.nextInt();
         } while (menu<1 && menu>5);    
            }
            
                        
            switch (menu) {
                case 1:
                    System.out.println("suma es: ");
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println("resta");
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println("multiplicar");
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println("dividir");
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    System.out.println("desea salir (S/N)");
                    salir = leer.next();
                    if(salir.equals("s")) {
                    aux=0;
                } else if (salir.equals("n")){
                    continue;
                }
                        
                    
                    
                
                    
            
            }
            }
        }
    }





