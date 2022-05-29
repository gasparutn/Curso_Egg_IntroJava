package javaapplication1;


import java.util.Random;

import java.util.Scanner;

/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
  cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
  */

/**
 *
 * @author gaspa
 */
public class Ejerc22_Vec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, cont=0, cont2=0, cont3=0, cont4=0, cont5=0;
        
        
        System.out.println("ingrese el tamano del vector: ");
        n= leer.nextInt();
    int[] vec= new int[n]; 
           
    for(int i = 0 ; i< n; i++) {
        vec[i] = new Random().nextInt(100000);
        if( vec[i]>=0 && vec[i]<10) {
          cont= cont+1;   
        }
        if(vec[i]>=10 && vec[i]<100) {
          cont2= cont2+1;   
        }
        if(vec[i]>=100 && vec[i]<1000) {
          cont3= cont3+1;   
        }
        if(vec[i]>=1000 && vec[i]<10000) {
          cont4= cont4+1;   
        }
        if(vec[i]>=10000 && vec[i]<1000000) {
          cont5= cont5+1;   
        }
      System.out.println(vec[i]);
    }
    System.out.println(" la cantidad de numeros de 1 digito es: "+cont);
    System.out.println(" la cantidad de numeros de 2 digitos es: "+cont2);
    System.out.println(" la cantidad de numeros de 3 digitos es: "+cont3);
    System.out.println(" la cantidad de numeros de 4 digitos es: "+cont4);
    System.out.println(" la cantidad de numeros de 5 digitos es: "+cont5);
    }
        
}
