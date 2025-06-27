/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication117;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class JavaApplication117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime cuantos alumnos vas a registrar: ");
        double cont=sc.nextDouble();
        double suma=0;
        double media=0;
        
        for(int i=1;i<=cont;i++){
            System.out.println("La nota del alumno "+i+" es: ");
            double nota=sc.nextDouble();
            suma+=nota;
            media=suma/cont;
        }
        System.out.println("La suma de las notas es: "+suma);
        System.out.println("La media de las notas es: "+media);
      
        
    }
    
}
