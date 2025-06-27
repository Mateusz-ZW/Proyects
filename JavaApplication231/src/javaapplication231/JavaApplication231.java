/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication231;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class JavaApplication231 {

    public static int menu(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1|| op>4){
            System.out.println("1.Saludar");
            System.out.println("2.Mostrar");
            System.out.println("3.Salir");
            op=sc.nextInt();
        }
        return op;
    }
    public static void saludar(){
        System.out.println("Hola buenas tardes");
    }
    public static void mostrar(){
        Scanner sc=new Scanner(System.in);
        saludar();
        System.out.println("El mensaje anterior es el saludo anterior");
        System.out.println("Dime un numero saludo: ");
        String saludo=sc.nextLine();
        System.out.println("Este es el nuevo mensaje: "+saludo);
        
    }
    
    public static void main(String[] args) {
       int op=menu();
       while(op!=3){
           switch(op){
               case 1: saludar();
               break;
               case 2: 
               mostrar();
               break;
           }
         op=menu();
       }
         
    }
    
}
