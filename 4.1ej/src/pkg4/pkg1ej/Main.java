/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg1ej;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Dime el tipo de figura que quieras implementar: ");
        System.out.println("1.Triangulo");
        System.out.println("2.Rectangulo");
        System.out.println("3.Ciculo");
        int opcion=sc.nextInt();
        switch(opcion){
            case 1:
                Triangulo t=new Triangulo();
                System.out.println("Dime la base: ");
                double base=sc.nextDouble();
                System.out.println("Dime la altura: ");
                double altura=sc.nextDouble();
                System.out.println("El perimetro es: "+t.perimetro(base, altura));
                System.out.println("El area es: "+t.area(base, altura));
                break;
                
            case 2:
                Rectangulo r=new Rectangulo();
                System.out.println("Dime la base: ");
                base=sc.nextDouble();
                System.out.println("Dime la altura: ");
                altura=sc.nextDouble();
                System.out.println("El perimetro es: "+r.perimetro(base, altura));
                System.out.println("El area es: "+r.area(base, altura));
                break;
                
            case 3:
                 Circulo c=new Circulo();
                System.out.println("Dime el radio: ");
                double radio=sc.nextDouble();
                
                System.out.println("El perimetro es: "+c.perimetro(radio));
                System.out.println("El area es: "+c.area(radio));
                break;
                
            default:
                System.out.println("Dime un numero acertado");
               
        }
        }
        
    }
    
}
