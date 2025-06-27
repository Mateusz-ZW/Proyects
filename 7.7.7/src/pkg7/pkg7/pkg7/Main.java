/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg7.pkg7;

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
        System.out.println("Dime el num: ");
        int num=sc.nextInt();
        System.out.println("Dime el den: ");
        int den=sc.nextInt();
        DividePorCero d=new DividePorCero(num,den);
        
        try{
            System.out.println("El resultado es "+d.operar());
        }
        catch(Exception e){
            System.out.println("No se divide por dividir por 0");
        }
    }
    
}
