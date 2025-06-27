/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleatorio;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Dime dos numeros: ");
        int n=sc.nextInt();
        int s=sc.nextInt();
        
        int random=(int)(Math.random()*(n-s)+1);
        System.out.println(random);
    }
    
}
