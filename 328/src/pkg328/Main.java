/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg328;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int sumaN(int numero)
            
    {
      
       if(numero==0){
           return numero;
          
       }
       else 
           
           return numero+sumaN(numero-1);
          
       
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero=sc.nextInt();
        System.out.println("La suma de los numeros"+numero+ "es: "+ sumaN(numero));
        // TODO code application logic here
    }
    
}
