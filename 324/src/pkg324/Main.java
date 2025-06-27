/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg324;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int maximo(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else
           return c;
    
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int max;

    int a, b, c;

    System.out.print("Introduzca un numero: ");

    a=sc.nextInt();

    System.out.print("Introduzca otro numero: ");

    b=sc.nextInt();

    System.out.print("Introduzca el último: ");

    c=sc.nextInt();

    System.out.println("");

    max =maximo (a, b, c);

    System.out.println("El número mayor es: " +max);

}
        // TODO code application logic here
    }
    

