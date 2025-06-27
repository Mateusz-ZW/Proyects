/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg13.pkg1;

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
       int [][]a=new int [2][5];
       //Como queremos rellenar por columnas pues empezamos el for por las columnas
       for(int j=0;j<a[0].length;j++){
            for(int i=0;i<a.length;i++){
           
               System.out.println("Dime un numero: ");
               a[i][j]=sc.nextInt();
           }
       }
        System.out.println("La matriz resultante es: ");
         for(int i=0;i<a.length;i++){
             //Iterar a través de cada columna de la fila actual
           for(int j =0;j<a[i].length;j++){
               System.out.print(a[i][j]);
           }
             System.out.println();
       }
    }
    
}
