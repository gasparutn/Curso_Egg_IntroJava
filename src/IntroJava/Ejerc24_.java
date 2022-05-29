
import java.util.Random;
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
public class Ejerc24_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean simetrica=true;
        
        int[][] mat= new int[3][3];  
        int valor=1; 
        
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j< mat.length; j++) {
               mat[i][j] = valor++; 
               System.out.println("insegre valor para la posicion ["+i+"]["+j+"}");
             mat[i][j]= leer.nextInt();
            }
            
        }
           for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j< mat.length; j++) {
                if(mat[i][j]!=mat[j][i]) {
                          simetrica=false;
                          break;
                      }
  
                
            }
            if(simetrica==false){
                break;
            }
           }
          
            if(simetrica==true) {
            System.out.println("la matriz es simetrica");    
            }
            else {
                System.out.println("la matriz no es simetrica");
            }
            
        
        }
    
               }
         
                 
    
    
      
            
  




