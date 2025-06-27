/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas1;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Pruebas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime cuantas veces quieres que carge el numero: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(n);
            n=sc.nextInt();
        }
        // TODO code application logic here
    }
    
}
