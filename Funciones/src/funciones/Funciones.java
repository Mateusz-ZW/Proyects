/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
      public static void area(int radio,int altura){
          System.out.println("El area del cilindro es: "+(int)(2*Math.PI*radio*altura + 2*Math.PI*Math.pow(radio, 2)));
      }
      public static void volumen(int radio,int altura){
          System.out.println("El volumen del cilindro es: "+(int)(Math.PI*Math.pow(radio, 2)+altura));
      }

    public static void main(String[] args) {
   //Realizar un procedimiento que calcule y muestre en pantalla el área o el volumen de un cilindro, según se especifique. 
   //Para distinguir un caso de otro se le pasará el carácter 'a' (para área) o 'v' (para el volumen).
   //Además hemos de pasarle al procedimiento el radio y la altura
   Scanner sc=new Scanner(System.in);
        System.out.println("Dime el radio: ");
        int radio=sc.nextInt();
        System.out.println("Dime la altura: ");
       int altura=sc.nextInt();
        System.out.println("Dime si quieres el area(a) o volumen(v): ");
        String op=sc.next();
        switch(op){
            case "a":
               area(radio,altura);
                break;
            case "v":
                volumen(radio,altura);
                break;
            default:
                System.out.println("Subnormal");
        }
        
      
    }
}
    

