/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg3.pkg1;

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
        try{
            
        int division=0;
        System.out.println("Dime un dividendo: ");
        int dividendo=sc.nextInt();
        System.out.println("Dime un divisor: ");
        int divisor=sc.nextInt();
        division=dividendo/divisor;
            System.out.println("El resultado es: "+division);
        
        }
        catch(Exception e){
            System.out.println("No se puede dividir por 0");
        }
    }
    
}
