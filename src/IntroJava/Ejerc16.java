/*
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
public class Ejerc16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correctos = 0;
        int incorrectos = 0;
        int largo;
        String letini;
        String letfin;
        String secuencia, FDE = "&&&&&";

        do {
            System.out.println("ingrese distintas secuencias");
            secuencia = leer.next();
            largo = secuencia.length();
            letini = "X";
            letfin = "O";
            if (largo == 5 && !secuencia.equals("&&&&&")) {
                if (secuencia.substring(0, 1).equals(letini) && secuencia.substring(4, 5).equals(letfin)) {
                    correctos = correctos + 1;
                }
                if (!secuencia.substring(0, 1).equals(letini) || !secuencia.substring(4, 5).equals(letfin)) {
                    incorrectos = incorrectos + 1;
                }
            }
        }while (!secuencia.equals("&&&&&"));
        System.out.println("EL numero de lecturas correctas es "+correctos);
        System.out.println("El numero de lecturas incorrectas es "+incorrectos);
    }
    
   

}
