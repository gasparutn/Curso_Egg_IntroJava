
import java.util.Scanner;

/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.

 */

/**
 *
 * @author gaspa
 */
public class Ejerci01ext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num, min, dia, hora;
        
        System.out.println("ingrese los minutos que desea calcular");
        num= leer.nextInt();
        min= num / 60;
        hora= num/ 60;
        System.out.println(""+min);
                
    }
    
}
