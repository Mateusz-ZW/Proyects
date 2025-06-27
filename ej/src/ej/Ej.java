/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Ej {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            try{
                 System.out.println("Dime un numero: ");
                 int n=sc.nextInt();
                 if (n>0)
                 {
                   System.out.println("El numero es positivo");
                 }
                 else if(n<0)
                 {
                    System.out.println("El numero es negativo");
                 }
                 
            }
            catch(Exception e){
                System.err.println("Error"+e.getMessage());
                break;
            }
         
        }
    }
    
}
