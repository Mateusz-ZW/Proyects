/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2019;

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
        double dato=0;
        boolean leido=false;
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
    public static String leerTexto(){
        Scanner sc=new Scanner(System.in);
        String dato="";
        boolean leido=false;
        while(!leido){
            try{
                System.out.println("Dime un texto: ");
                dato=sc.nextLine();
                leido=true;
            }
            catch(Exception e){
                System.out.println("Texto no valido");
                sc.nextLine();
            }
        }
        return dato;
    }
}
