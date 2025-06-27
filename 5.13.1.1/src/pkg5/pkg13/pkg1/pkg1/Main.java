/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg13.pkg1.pkg1;

import java.util.Random;
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
            Scanner sc=new Scanner(System.in);
            Random random=new Random();
            System.out.println("Cuantas columnas quieres: ");
            int col=sc.nextInt();
       int [][]a=new int [5][col];
       //Como queremos rellenar por columnas pues empezamos el for por las columnas
       for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
           
               a[i][j]=random.nextInt(0, 10);
           }
       }
        System.out.println("La matriz resultante es: ");
         for(int i=0;i<a.length;i++){
            
           for(int j =0;j<a[0].length;j++){
               System.out.print(a[i][j]);
           }
             System.out.println();
       }
    }
    
}
    
    

