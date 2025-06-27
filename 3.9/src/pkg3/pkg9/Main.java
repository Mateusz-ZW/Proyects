/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg9;

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
        System.out.println("Dime tu sueldo: ");
        double sueldo=sc.nextDouble();
        System.out.println("Dime tu antiguedad en años: ");
        int anio=sc.nextInt();
        double aumento=0;
        if(sueldo<500 && anio>=10){
            aumento=0.2*sueldo;
            System.out.println("El sueldo que recibe con el aumento es de unos: "+(sueldo+aumento));
        }
        else if(sueldo<500 && anio<10){
            aumento=0.05*sueldo;
            System.out.println("El sueldo que recibe con el aumento es de unos: "+(aumento+sueldo));
        }
        else{
            System.out.println("El sueldo es "+sueldo);
        }
        
    }
    
}
