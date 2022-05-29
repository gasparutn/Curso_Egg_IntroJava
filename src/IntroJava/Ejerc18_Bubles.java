/*
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc18_Bubles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
    int num = 0; 
    int cont= 0;
       
     System.out.println("ingrese 4 numeros entre el 1 al 20: ");
       for (int i =0 ; i<=4 ; i++){
       num=leer.nextInt();
       
           System.out.print(num);       
        do { 
            System.out.print("*");
            cont= cont+1;
            
        }while (cont < num);
           System.out.println("");
       cont=0; 
       }
                     
       }
    }
    
           
    
       
    
    
    
    

