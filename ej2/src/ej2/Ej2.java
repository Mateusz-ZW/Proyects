/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int s=0;
       
        while(s!=300){
            System.out.println("Dime un numero que sea 300: ");
            s=sc.nextInt();
        }
        while(n!=200){
            System.out.println("Dime un numero que sea 200: ");
            n=sc.nextInt();
        }
        int cont=0;
        for(int i=s;i>=n;i-=10){
            if(i%3==0){
                System.out.println(i);
                cont++;
            }
        }
        System.out.println("El numero de multiplos de 3 ha sido: "+cont);
        
       
        
        
        
    }
    
}
