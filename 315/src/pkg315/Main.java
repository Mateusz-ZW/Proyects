/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg315;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double promedio;
        int suma=0;
        int contador=0;
        do{
            System.out.println("Dime un numero: ");
            int n=sc.nextInt();
            suma+=n;
            contador++;
           promedio=(double)suma/contador;
            
           System.out.println( "El promedio es"+ promedio);
            
        }while(promedio<=25);
         
        
        // TODO code application logic here
    }
    
}
