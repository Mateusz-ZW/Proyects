/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz4x5;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Matriz4x5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int[][]matriz=new int[4][5];
       
       for( int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz[0].length;j++){
               System.out.println("Dime el numero: ");
               matriz[i][j]=sc.nextInt();
               
           }
         
       }
       for(int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz[0].length;j++){
               System.out.print(matriz[i][j]);
               
           }
           System.out.println(" ");
       }
        
       
    }
    
}
