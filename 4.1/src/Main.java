/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


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
        double radio;
        System.out.println("Dime el radio del circulo: ");
        radio=sc.nextDouble();
     
        Circulo c=new Circulo(radio);
        
        
        System.out.println(c.perimetro());
        System.out.println(c.area());
        // TODO code application logic here
    }
    
}
