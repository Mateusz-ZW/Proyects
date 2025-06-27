/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg1.pkg1;

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
     double n= (int)(Math.random()*500+1);
     while(n!=-1){
         try{
        System.out.println("Dime un numero: ");
        int s=sc.nextInt();
        if(s<n){
            System.out.println("El numero tiene que ser mayor");
        }
        else if(s>n){
            System.out.println("El numero tiene que ser menor ");
        }
        else
        {
            System.out.println("El numero es igual ");
            sc.next();
        }
         }
         catch(Exception e){
             System.out.println("Numero no valido");
             sc.nextLine();
         }
        
    }
    }
    
}
