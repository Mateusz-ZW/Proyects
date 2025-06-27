/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg2.pkg2;

import java.util.InputMismatchException;
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
        int []a=null;
        try{
        System.out.println("Dime el espacio del array: ");
        int n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("Dime que numeros quieres meter en el array: ");
            a[i]=sc.nextInt();
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        int i=0;
        
      while (i < a.length)
        {
            try
            {
                System.out.println ("Valor "+(i+1));
                a[i] = sc.nextInt();
                i++;
            }
            catch (Exception e)
            {
                System.out.println("Número inválido");
                sc.nextLine();
            }
        }
        
        int p = -1;
        while (p!=0)
        {
            try
            {
                System.out.print("Posición: ");
                p = sc.nextInt();
                if (p!=0)
                    System.out.println("El valor es "+a[p-1]);
            }
            catch (InputMismatchException e)
            {
                System.out.println("Número inválido");
                sc.nextLine();
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.println("Posición no válida");
            }
        }
       
    }
    
}
