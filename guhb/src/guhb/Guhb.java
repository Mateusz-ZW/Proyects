/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guhb;

import java.util.Scanner;





/**
 *
 * @author mateo
 */
public class Guhb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Tabla de multiplicar
       Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int n=sc.nextInt();
        
        for(int i=0;i<=10;i++){
            int resultado=n*i;
            System.out.println(n+"x"+i+"="+resultado);
            
            
        }
       
       
       
        
    }
    
}
