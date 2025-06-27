/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg9;

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
        Fraccion f1=null;
        Fraccion f2=null;
        try{
            System.out.println("Dime el numerador 1: ");
            int n1=sc.nextInt();
            System.out.println("Dime el denominador 1: ");
            int d1=sc.nextInt();
            System.out.println("Dime el numerador 2: ");
            int n2=sc.nextInt();
            System.out.println("Dime el denominador 2: ");
            int d2=sc.nextInt();
            f1=new Fraccion(n1,d1);
            f2=new Fraccion(n2,d2);
            System.out.println("La suma de f1 y f2 es: "+f1.sumar(f2));
            System.out.println("La resta de f1 y f2 es :"+f1.restar(f2));
            System.out.println("La multiplicacion de f1 y f2 es: "+f1.multiplicar(f2));
            System.out.println("La division de f1y f2 es: "+f1.dividir(f2));
        }
        catch(FraccionExcepcion e){
            System.out.println("Error ");
        }
    }
    
}
