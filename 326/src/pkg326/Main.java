/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg326;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int numero){
        if(numero==1){
            return 1;
        }
        else{
            return numero*factorial(numero-1);
        }
            
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero=sc.nextInt();
        System.out.println("El factorial de "+numero+" es: "+factorial(numero));
        // TODO code application logic here
    }
    
}
