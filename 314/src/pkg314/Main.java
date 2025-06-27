/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg314;

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
        System.out.println("Dime un numero: ");
        int num=sc.nextInt();
       
       
        while(num!=-1)
        {
            boolean esprimo=true;
            int n=2;
            while(n<Math.sqrt(n)&&esprimo)
            {
             
            if(num%n==0)
            {
                esprimo=false;
            }
            n++;
            }
        
            if(esprimo){
                System.out.println("El numero "+ num+ "es primo");
            }
            else{
                System.out.println("El numero " + num+ " no es primo");
            }
             System.out.println("Dime otro numero: ");
             num=sc.nextInt();
        }
        
        }
    
       
    }
        // TODO code application logic here
    
    

