/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg329;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void Ascendentes(int numero){
        if(numero==1){
            System.out.println(numero);
        }
        else{
            Ascendentes(numero-1);
            System.out.println(numero);
            
        }
            
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero=sc.nextInt();
        Ascendentes(numero);
        // TODO code application logic here
    }
    
}
