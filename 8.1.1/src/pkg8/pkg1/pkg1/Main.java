/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg1.pkg1;

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
        ListaCantantesFamosos l =new ListaCantantesFamosos();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el nombre del cantante");
        String n = sc.nextLine();
        
        l.añadir(n);
        System.out.println("Dime el nombre del cantante");
        //Esto es para poder añadir a cantantes pero que el usuario los escriba por pantalla
        l.añadir(sc.nextLine());
        
        
        System.out.println(l);
        
    }
    
}
