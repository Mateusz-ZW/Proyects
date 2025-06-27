/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primo;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int n=sc.nextInt();
        boolean esprimo=true;
        int i=2;
       while(n!=-1)
       {
           while(i<=Math.sqrt(n) && esprimo)
           {
               //n=5 i=2 5%2!=0 
               //n=4 i=2 4%2==0
               if(n%i==0)
               {
                   esprimo=false;
               }
               i++;
                   
           }
           if(esprimo)
           {
               System.out.println("Es primo");
           }
           else
               System.out.println("No es primo ");
           System.out.println("Dime otro numero: ");
           n= sc.nextInt();
               
       }
    }
    
}
