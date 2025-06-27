/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasojava2;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class RepasoJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int n=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
            
        }
    }
    
}
