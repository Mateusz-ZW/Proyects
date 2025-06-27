/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg2;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Ej52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c=new Circulo();
        Triangulo t=new Triangulo();
        Rectangulo r=new Rectangulo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Especifique el tipo de figura: \n1.Triangulo rectangulo \n2.Rectangulo \n3.Circulo");
        int n=sc.nextInt();
        
        switch(n){
            case 1:System.out.println("Dime la base: ");
                    double base=sc.nextDouble();
                    System.out.println("Dime la altura: ");
                    double altura=sc.nextDouble();
                    System.out.println("El perimetro del triangulo es: "+t.perimetro());
                    System.out.println("El area del traingulo es: "+t.area());
                    break;
                    
            case 2: System.out.println("Dime la base: ");
                    double b=sc.nextDouble();
                    System.out.println("Dime la altura: ");
                    double a=sc.nextDouble();
                    System.out.println("El perimetro del Rectangulo es: "+r.perimetro());
                    System.out.println("El area del Rectangulo es: "+r.area());
                    break;
                    
            case 3: System.out.println("Dime el radio: ");
                    double radio=sc.nextDouble();
                    System.out.println("La longitud del circulo es: "+c.perimetro());
                    System.out.println("El area del circulo es: "+c.area());
                    break;
            default:
                System.out.println("Di un numero del 1 al 3");
        }
        // TODO code application logic here
    }
    
}
