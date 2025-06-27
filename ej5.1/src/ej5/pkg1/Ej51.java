/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg1;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Ej51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el radio del circulo: ");
        double radio=sc.nextDouble();
        
        Circulo c=new Circulo(radio);
                
        c.setRadio(radio);
        System.out.println("El perimetro es: "+c.perimetro());
        System.out.println("El area es: "+ c.area());
        
        // TODO code application logic here
    }
    
}
