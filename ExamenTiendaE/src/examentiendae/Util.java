/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentiendae;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Util {
    public static int leerInt(){
        Scanner sc=new Scanner(System.in);
        boolean leido=false;
        int dato=0;
        while(!leido){
            try{
                System.out.println("Dime un numero: ");
                dato=sc.nextInt();
                leido=true;
            }
            catch(Exception e){
                System.out.println("Numero no valido");
                sc.nextLine();
                
            }
        }
        return dato;
        
    }
      public static double leerDouble(){
        Scanner sc=new Scanner(System.in);
        boolean leido=false;
        double dato=0;
        while(!leido){
            try{
                System.out.println("Dime un numero: ");
                dato=sc.nextDouble();
                leido=true;
            }
            catch(Exception e){
                System.out.println("Numero no valido");
                sc.nextLine();
                
            }
        }
        return dato;
        
    }
}
