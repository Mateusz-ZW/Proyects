/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasojava;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class RepasoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int n=sc.nextInt();
          System.out.println("Dime un numero: ");
        int j=sc.nextInt();
          System.out.println("Dime un numero: ");
        int s=sc.nextInt();
        
        if(n%2==0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("Es impar");
    }
        if(j>=0){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("Es negativo");
        }
        if((s%2==0) && (s%5==0) && (s%10==0) && (s>100 )){
            System.out.println("Es par, multiplo de 5 y 10 y mayor que 100");
        }
        else if((s%2==0) && (s%5==0) && (s%10==0) && ( s <100)){
            System.out.println("Es par, multiplo de 5 y 10 y menor que 100");
        }
    }
    
}
