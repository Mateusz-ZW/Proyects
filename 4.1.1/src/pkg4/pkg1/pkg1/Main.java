/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg1.pkg1;

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
        
        int op;
        do{
        System.out.println("Especifique el tipo de figura: ");
        System.out.println("1.Triangulo rectangulo");
        System.out.println("2.Rectangulo");
        System.out.println("3.Circulo");
        op=sc.nextInt();
        
        switch(op){
            case 1:
                Triangulo t=new Triangulo();
                System.out.println("Dime la base: ");
                double base=sc.nextDouble();
                System.out.println("Dime la altura: ");
                double altura=sc.nextDouble();
                
                System.out.println("El perimetro es: "+t.perimetro(altura, base));
                System.out.println("El area es: "+t.area(altura, base));
                break;
                
            case 2:
                Rectangulo r=new Rectangulo();
                System.out.println("Dime la base: ");
                base=sc.nextDouble();
                System.out.println("Dime la altura: ");
                altura=sc.nextDouble();
                
                System.out.println("El perimetro es: "+r.perimetro(altura, base));
                System.out.println("El area es: "+r.area(altura, base));
                break;
                
            case 3:
                Circulo c=new Circulo();
                System.out.println("Dime el radio: ");
                double radio=sc.nextDouble();
                System.out.println("El perimetro es: "+c.perimetro(radio));
                System.out.println("El area es: "+c.area(radio));
                break;
                
            default:
                System.out.println("Figura no valida");
                
        }
        }while(op!=0);
        System.out.println("Se acabo el programa");
    }
    
}
