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

   
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       double random=(int)(Math.random()*500)+1;
       int i=0;
       while(true){
       try{
           
        System.out.println("Dime un numero: ");
        int n=sc.nextInt();
        if(n>random){
            System.out.println("Es numero es menor");
            i++;
        }
        else if(n<random){
            System.out.println("El numero es mayor");
            i++;
        }
        else if(n==random){
            System.out.println("¡¡¡¡Adivinaste!!!!");
            i++;
            System.out.println("El numero de intentos ha sido: "+i);
            break;
        }
        
       }
       catch(Exception e){
           System.out.println("Numero invalido");
           i++;
       }
       }
    }
    
}
