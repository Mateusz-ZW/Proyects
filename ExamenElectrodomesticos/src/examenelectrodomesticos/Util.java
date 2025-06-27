/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenelectrodomesticos;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Util {
    public static int leerInt(){
        Scanner sc=new Scanner(System.in);
        boolean leido=false;
        int n=0;
        while(!leido){
            try{
                n=sc.nextInt();
                leido=true;
                
            }catch(Exception e){
                System.out.println("Numero no valido");
                sc.nextLine();
                
            }
        }
        return n;
    }
    public static double leerDouble(){
        Scanner sc=new Scanner(System.in);
        double n=0;
        boolean leido=false;
        while(!leido){
            try{
                 n=sc.nextDouble();
                 leido=true;
            }
            catch(Exception e){
                System.out.println("Numero no valido");
                sc.nextLine();
            }
        }
        return n;
    }
}
