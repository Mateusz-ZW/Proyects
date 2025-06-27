/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Util {
    public static int leerInt(){
        Scanner sc=new Scanner(System.in);
        int dato=0;
        boolean leido=false;
        while(!leido){
            try{
                System.out.println("Dime un numero: ");
                dato=sc.nextInt();
            }
            catch(Exception e){
                
            }
        }
        return dato;
        
    }
    public static double leerDouble(){
        Scanner sc=new Scanner(System.in);
        double dato=0;
        boolean leido=false;
        while(!leido){
            try{
                System.out.println("Dime un numero: ");
                dato=sc.nextDouble();
            }
            catch(Exception e){
                
            }
        }
        return dato;
        
    }
}
