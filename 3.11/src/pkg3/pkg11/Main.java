/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg11;

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
        System.out.println("Dime cuantos numeros quieres cargar: ");
        int n=sc.nextInt();
        int suma=0;
        double promedio=0;
        
        for(int i=0;i<n;i++){
            System.out.println("Dime el valor "+i+":");
            int valor=sc.nextInt();
            suma+=valor;
            promedio=suma/n;
            
        }
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+promedio);
    }
    
}
