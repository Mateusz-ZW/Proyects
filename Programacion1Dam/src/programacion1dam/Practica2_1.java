/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion1dam;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Practica2_1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       final int CTE=2;
       Scanner sc=new Scanner(System.in);
       
        
        System.out.println("Introduce un texto: ");
        String texto=sc.nextLine();
        System.out.println("El primer caracter del texto es: "+texto.substring(0,1));
        System.out.println("Dime un numero entero: ");
        int n=sc.nextInt();
        
        System.out.println("El resultado es: "+n*CTE);
        System.out.println("Dime un nombre: ");
        String nombre=sc.next();
        if(nombre.equalsIgnoreCase("NOHA")){
            System.out.println("Buenos dias Noha");
        }
        else
            System.out.println("No has escrito Noha");
        
       
        
        
   
    }
    
}
