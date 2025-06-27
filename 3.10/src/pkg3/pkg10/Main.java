/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10;

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
        System.out.println("Dime un numero entero: ");
        int n=sc.nextInt();
        int cont=1;
        if(n>0){
        while(cont<=n){
            System.out.println(cont);
            cont++;
        }
        }
        else{
            System.out.println("El numero tiene que ser mayor a 0");
        }
    }
    
}
