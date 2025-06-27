/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package x;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class X {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        try{
            boolean valido=true;
            
        System.out.println("Dime el color de tu piel: ");
        String color=sc.nextLine();
        if(color.equals("negro")){
            System.out.println("Eres racista");
        }
        if(color!="negro")
                System.out.println("Ta bueno ");
        }
        catch(Exception e){
            System.out.println("Tienes que decir un color ");
        }
        }
    }
     
}
