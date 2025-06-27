/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg7.pkg1;

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
        System.out.println("Dime un numerador: ");
        int num=sc.nextInt();
        
        System.out.println("Dime un denominador: ");
        int den=sc.nextInt();
        
        DividePorCero d=new DividePorCero(num,den);
            System.out.println("El resultado es: "+d.operar(num, den));
    }
        catch(Exception e){
            System.out.println("Error:división por cero");
        }
    }
    
}
