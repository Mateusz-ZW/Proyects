/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication154;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class JavaApplication154 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int[]array=new int[10];
       int suma=0;
       for(int i=0;i<array.length;i++){
           System.out.println("Dime numeros para completar el array: ");
           array[i]=sc.nextInt();
           suma+=array[i];
       }
        System.out.println(suma);
       
    }
   
 

}