/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication157;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class JavaApplication157 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Dime a(animal) o p(perro): ");
        String op=sc.next();
        switch(op){
            case "a":
            System.out.println("Dime el nombre: ");
        String n=sc.next();
        System.out.println("Dime la edad: ");
        int edad=sc.nextInt();
        Animal a=new Animal(n,edad);
            System.out.println(a.toString());
        break;
            case "p":
        System.out.println("Dime el nombre: ");
         n=sc.next();
        System.out.println("Dime la edad: ");
        edad=sc.nextInt();
        System.out.println("Dime la raza: ");
        String raza=sc.next();
        Perro p=new Perro(n,edad,raza);
            System.out.println(p.toString());
            break;
            
            default:
                System.out.println("No has puesto bien la letra");
        }
    }
    
    
}
