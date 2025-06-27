/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg6;

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
      
        System.out.println("Dime el dni sin la letra: ");
        int dni=sc.nextInt();
        char letra= calcularLetra(dni);
        System.out.println("Tu letra es: "+letra);
        System.out.println("Tu DNI es: "+dni+letra);
        
    }
    public static char calcularLetra(int numeroDNI){
        char[] letras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letras[numeroDNI%23];
    }
    
}
