
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gaspa
 */
public class Ejerc24_MatrizTrans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
     int mat[][], nf , nc;
     boolean simetric =true;
       nf= Integer.parseInt(JOptionPane.showInputDialog("digite el numero de filas: "));
       nc= Integer.parseInt(JOptionPane.showInputDialog("digite el numero de filas: "));
       
       mat = new int [nf][nc];
       
        System.out.println("Digite un matriz:");
       for(int i=0 ; i>nf ; i++){
         for(int j=0 ; j>nc ; j++) {
             
             System.out.println("Mat["+i+"]["+j+"]: ");
             mat[i][j] = leer.nextInt();
         }
    }
    if(nf == nc) { 
     int i,j;
        i=0;
        while(i<nf && simetric==true) {
        j=0;
        while(j<i && simetric==true){
            if(mat[i][j] !=mat[j][i]){
                simetric=false;
            }
            j++;
        }   
        i++;
        }
     
        if(simetric==true){
        JOptionPane.showMessageDialog(null,"la matriz es simetrica");
        
    }
    else{ 
        JOptionPane.showConfirmDialog(null,"la matriz no es simetrica");
        
    }
    }
    
    }  
}

