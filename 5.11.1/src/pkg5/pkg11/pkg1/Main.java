/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg11.pkg1;

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
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];
        for (int i = 0; i < a.length; i++) {
             for (int j = 0; j < a[0].length; j++) {
            System.out.println("Dime numeros: ");
            a[i][j] = sc.nextInt();
            }
        }
        System.out.println("La matriz es: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("Ahora vamos a imprimir la diagonal principal");
         
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                //si por ejemplo es (1,1) escribe si es (2,2) tambien, si es(2,3) no escribe
                if(i==j){
                System.out.print(a[i][j]);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
