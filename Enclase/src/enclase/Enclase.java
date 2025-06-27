/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enclase;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Enclase {

    /**
     * @param args the command line arguments
     */
    
    public static void elevarPotencia(int n,int s){
        System.out.println( Math.pow(n, s));
    }
    public static void suma(int n,int s){
        System.out.println( n+s);
    }
    public static void dividir(int i,int XD){
        System.out.println( i/XD);
    }
    public static void mult(int n,int bruh){
        System.out.println( n*bruh);
    }
    public static void main(String[] args) {
        int op;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime que opcion desea: ");
        System.out.println("1.Elevar a potencia");
        System.out.println("2.Suma dos numeros");
        System.out.println("3.Dividir dos numeros");
        System.out.println("4.Multiplicar dos numeros");
        op=sc.nextInt();
        
            switch(op)
            {
                case 1: 
                    System.out.println("Dime el numero a elevar: ");
                    int n=sc.nextInt();
                    System.out.println("Dime el exponente: ");
                    int s=sc.nextInt();
                    elevarPotencia(n,s);
                    break;
                case 2:
                    System.out.println("Dime dos numeros a sumar: ");
                    n=sc.nextInt();
                    int i=sc.nextInt();
                    suma(n,i);
                  
                    break;
                case 3:
                    System.out.println("Dime dos numeros a dividir: ");
                    n=sc.nextInt();
                    i=sc.nextInt();
                    if(n>0 && i>0)
                    {
                        dividir(n,i);
                        
                    break;
                    }
                    else
                        System.out.println("No se puede dividir por 0");
                case 4:
                    System.out.println("Dime dos numeros a multiplicar: ");
                    n=sc.nextInt();
                    i=sc.nextInt();
                    mult(n,i);
                    break;
                    
                default:
                    System.out.println("Introduce un numero del 1-4");
                    
            }
           
           
                    
        } while(op!=5);
        
    }
}
    
    

