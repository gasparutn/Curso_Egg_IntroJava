/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;



/**
 *
 * @author Gsapar
 */
public class Ejerc02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String name; 
        System.out.println("ingrese su nombre:"); 
        name= leer.next();
        System.out.println("su nombre es "+name);       
        System.out.println("");
    }
    
}
