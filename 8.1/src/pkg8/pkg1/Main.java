/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg1;

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
        ListaCantantesFamosos l=new ListaCantantesFamosos();
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime otro cantante: ");
        String cantante=sc.nextLine();
        
        l.añadir(cantante);
        System.out.println("Dime el nombre del otro cantante: ");
        String cantante2=sc.nextLine();
        l.añadir(cantante2);
        System.out.println(l);
    }
    
}
