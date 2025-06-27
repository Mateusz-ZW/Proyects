/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carniceriamanolo;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Util {
    public static int leerInt(){
        Scanner sc=new Scanner(System.in);
        while(true){
            try{
                return sc.nextInt();
            }
            catch(Exception e){
                System.out.println("Numero no valido");
                sc.nextLine();
            }
        }
    }
    public static double leerDouble(){
        Scanner sc=new Scanner(System.in);
        while(true){
            try{
                return sc.nextDouble();
            }
            catch(Exception e){
                System.out.println("Numero no valido");
                sc.nextLine();
            }
        }
    }
}
