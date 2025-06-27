/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication233;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class JavaApplication233 {

    /**
     * @param args the command line arguments
     */
    public static int menu(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op>3){
            System.out.println("1.Muestra el nombre: ");
            System.out.println("2.Muestra la edad: ");
            System.out.println("3.Salir");
            op=sc.nextInt();
        }
        return op;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        String nombre=sc.next();
        System.out.println("Dime la edad: ");
        int edad=sc.nextInt();
         
        int op=menu();
        while(op!=3){
             switch(op){
                 case 1: System.out.println("El nombre es: "+nombre);
                 break;
                 case 2: System.out.println("La edad es: "+edad);
                 break;
                 default: System.out.println("Numero no valido");
        }
             op=menu();
        }
       
        
    }
    
}
