/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication159;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class JavaApplication159 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un nombre: ");
        String nombre=sc.nextLine();
            File f=new File(nombre);
            f.createNewFile();
            
    }
    
}
