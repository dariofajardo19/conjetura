/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;

import java.util.Scanner;

/**
 *
 
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner reader = new Scanner(System.in);
        int primo = 0;
        int i,j;
        //System.out.println("Introduce número primo");
        //int [][] matriz = new int[9][3];
        int [][] matriz= {{3,5,7,13,17,37,47,67,73},{97,103,137,163,167,193,233,277,293},{307,313,317,347,373,463,487,503,547}};

        System.out.println("validar conjetura:");
        for (i = 0; i < matriz.length; i++) { 
            for (j = 0; j < matriz[i].length; j++) {
                
                if(matriz[i][j]==5){
                
                        System.out.println("5  soy la excepción");
                }
                else{
                    primo = (matriz[i][j]*matriz[i][j])+4;
                    System.out.print(matriz[i][j] + " resultado valido: "+primo);
                    System.out.println();
                }
                
            }
            //System.out.println();
        }
        
        
        
        //primo= reader.nextInt();
      //  int respuesta = (primo * primo)+4;
        //System.out.println("Dato Valido: "+respuesta );
        
    }
    
}
