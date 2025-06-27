/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg12;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc=new Scanner(System.in);
       int [][]array=new int[3][4];
       for(int i=0;i<array.length;i++){
           for(int j=0;j<array.length;j++){
               System.out.println("Dime la posicion: ");
               array[i][j]=sc.nextInt();
           }
       }
       //primera fila
       for(int j=0;j<array[0].length;j++)
       {
         System.out.print(array[0][j]+"");
       }
         System.out.println();
      
    //ultima fila
       for(int j=0;j<array[array.length-1].length;j++){
           System.out.print(array[array.length-1][j]);
       }
        System.out.println();
        //primera columna
        for(int i=0;i<array.length;i++){
            System.out.print(array[i][0]);
        }
        System.out.println();

    }
}
