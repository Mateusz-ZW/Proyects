/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg330;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void Descendentes(int numero){
        if(numero==1){
           System.out.println(numero);
        }
        else{
            
            System.out.println(numero);
            Descendentes(numero-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero=sc.nextInt();
        Descendentes(numero);
        // TODO code application logic here
    }
    
}
