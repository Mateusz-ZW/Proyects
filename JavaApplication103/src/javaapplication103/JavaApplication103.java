/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication103;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class JavaApplication103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Dime un numero: ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("El numero es negativo");
        }
        else if(n>0){
            System.out.println("El numero es positivo");
        }
        else
            System.out.println("El numero es 0");
    }
    }
    
}
