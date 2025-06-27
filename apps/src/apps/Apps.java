/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apps;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Apps {

    /**
     * @param args the command line arguments
     */
    public static double calcularArea(double radio){
        return Math.pow(radio, 2)*Math.PI;
    }
     public static double calcularAreaT(double base,double altura){
        return (base*altura)/2;
    }
      public static double calcularAreaCu(double lado){
        return lado*lado;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Que figura quieres que te calcule el area,(1,2,3)");
       int op=sc.nextInt();
        if(op==1){
            System.out.println("Dime el radio del circulo: ");
            double radio=sc.nextDouble();
            
            System.out.println("El area es "+calcularArea(radio));
        }
        if(op==2){
            System.out.println("Dime la base: ");
            double base=sc.nextDouble();
            System.out.println("Dime la altura: ");
            double altura=sc.nextDouble();
            System.out.println("El area es "+calcularAreaT(base,altura));
            
        }
        if(op==3){
            System.out.println("Dime el lado: ");
            double lado=sc.nextDouble();
            System.out.println("El area es: "+calcularAreaCu(lado));
        }
        }
        }
}
      
     
     


        
       
    
    
    

