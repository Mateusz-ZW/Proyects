/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeo;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Testeo {

    /**
     * @param args the command line arguments
     */
    public static void moneda(double euros,char c){
       
            if(c=='l'){
                System.out.println("El numero de libras es: "+0.87*euros);
            }
            else if(c=='d'){
                 System.out.println("El numero de dolares es: "+1.0611*euros);
            }
            else if(c=='y'){
               System.out.println("El numero de yenes es: "+159.852*euros);
            }
            else
                System.out.println("Introduce un solo caratecer");
            
        }
        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Dime l para libras,d para dolares y y para yenes ");
        String texto=sc.next();
        System.out.println("Dime la cantidad de euros: ");
        double euros=sc.nextDouble();
        
        

        while(texto.length()!=1){
            System.out.println("Debe introducir solo un caracter");
            texto=sc.next();
        }
       moneda(euros,texto.charAt(0));
    }
}
        // TODO code application logic here
    
    

