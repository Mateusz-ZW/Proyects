/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg9.pkg1;

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
         try
        {      
            System.out.print("Fracción 1, num: ");
            int num1 = sc.nextInt();
            System.out.print("Fracción 1, den: ");
            int den1 = sc.nextInt();
            System.out.print("Fracción 2, num: ");
            int num2 = sc.nextInt();
            System.out.print("Fracción 2, den: ");
            int den2 = sc.nextInt();

           Fraccion f1 = new Fraccion(num1,den1);
           Fraccion f2 = new Fraccion(num2,den2);
            
            System.out.println(f1+" + "+f2+" = "+f1.sumar(f2));
            System.out.println(f1+" - "+f2+" = "+f1.restar(f2));
            System.out.println(f1+" * "+f2+" = "+f1.multiplicar(f2));
            System.out.println(f1+" : "+f2+" = "+f1.dividir(f2));
            
        }
        catch (FraccionException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Error leyendo los datos");
        }
                
    }
    
}
    
    

