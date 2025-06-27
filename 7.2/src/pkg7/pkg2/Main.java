/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg2;

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
       int array[]=null;
       
        System.out.println("Dime el limite del array: ");
        
        while(array==null){
            try{
                int n=sc.nextInt();
                array=new int[n];
                
            }
            catch(Exception e){
                System.out.println("Error");
                sc.nextLine();
            }
        }
        int i=0;
        while(i<array.length){
            try
            {
                System.out.println("Valor: "+(i+1));
                array[i]=sc.nextInt();
                i++;
                
            }
            catch(Exception e){
                System.out.println("Error");
                sc.nextLine();
            }
        }
        int p=-1;
        while(p!=0){
            try{
                System.out.println("Posicion: ");
                p=sc.nextInt();
                if(p!=0){
                    System.out.println("El valor de "+array[p-1]);
                    
                }
            }
                catch(InputMismatchException e){
                        System.out.println("Numero no valido");
                        sc.nextLine();
                }
            catch(IndexOutOfBoundsException e){
                System.out.println("Posicion no valida");
            }
        }
    }
    
}
