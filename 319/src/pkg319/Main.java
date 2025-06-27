/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg319;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static boolean esPar(int n)
    {
        return n%2==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero=sc.nextInt();
        while(numero>0){
            if(esPar(numero)){
                System.out.println("El numero " +numero+ " es par");
            }
            else
                System.out.println("El numero "+numero+ " es impar");
            System.out.println("Dime otro numero: ");
            numero=sc.nextInt();
        }
        
        // TODO code application logic here
    }
    
}
