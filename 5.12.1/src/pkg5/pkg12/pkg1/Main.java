/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg12.pkg1;

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
       int a[][]=new int[3][4];
       
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a[0].length;j++){
               System.out.println("Dime numeros: ");
               a[i][j]=sc.nextInt();
           }
       }
       
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a[0].length;j++){
               System.out.print(a[i][j]);
           }
           System.out.println("");
       }
       //Imprimir la primera fila:
        System.out.println("La primera fila es: ");
        
           for(int j=0;j<a[0].length;j++){
               System.out.print(a[0][j]);
               
           }
           System.out.println();
       
         
         
          //Imprimir la ultima fila:
        System.out.println("La ultima fila es: ");
         //Tengo que poner el -1 porque si no se va de rango
           for(int j=0;j<a[a.length-1].length;j++){
               System.out.print(a[a.length-1][j]);
               
           }
           
           System.out.println();
           //Imprimir la primera columna
           System.out.println("La primera columna es: ");
           for(int i=0;i<a.length;i++){
               System.out.print(a[i][0]);
           }
           System.out.println();
       }
    }
    

