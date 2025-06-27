/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasotema3;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class RepasoTema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Dime un mes en forma numerica: ");
        int anio=sc.nextInt();
        if(anio%4==0 && !(anio%100==0 && anio%400!=0)){
            System.out.println("Es un año bisiesto");
        }
        else{
            System.out.println("No es un año bisiesto");
        }
   
    }
    
}
