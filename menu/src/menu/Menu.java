/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc=new Scanner(System.in);
    public static int menu(){
       int op=0;
       
        System.out.println("Dime la opcion que quieras realizar");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        op=sc.nextInt();
        
        
        return op;
    }
    public static void sumar(int n1,int n2){
        System.out.println("El resultado es: "+ (n1+n2));
    }
     public static void restar(int n1,int n2){
         System.out.println("El resultado es: "+(n1-n2));
    }
      public static void mult(int n1,int n2){
          System.out.println("El resultado es: "+(n1*n2));
    }
       public static void div(int n1,int n2){
           
            System.out.println("El resultado es: "+(n1/n2));
    }
    public static void main(String[] args) 
    {
        System.out.println("Dime un numero: ");
        int n=sc.nextInt();
        System.out.println("Dime otro numero: ");
        int s=sc.nextInt();
        int op=0;
       
        while(op!=5)
        {
            
            op=menu();
            
        switch(op)
            {
            case 1:
                sumar(n,s);
                break;
            case 2: restar(n,s);
                     break;
            case 3:  mult(n,s);
            break;
            case 4: div(n,s);
            break;
            default: System.out.println("Opcion no valida");
            }   
        }
    }
}
    

