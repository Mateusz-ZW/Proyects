/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4.pkg8;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Ej48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fecha f=new Fecha();
        
        System.out.println("Dime el dia: ");
        int dia=sc.nextInt();
        System.out.println("Dime el mes: ");
        int mes=sc.nextInt();
        System.out.println("Dime el anio: ");
        int anio=sc.nextInt();
       if(f.fechaCorrecta(dia,mes,anio)){
           System.out.println(f.toString());
       }
       
        
        // TODO code application logic here
    }
    
}
