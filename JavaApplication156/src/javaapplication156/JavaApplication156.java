/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication156;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class JavaApplication156 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        
        System.out.println("Dime el precio: ");
        double precio=sc.nextDouble();
        System.out.println("Dime el cliente: ");
        String cliente=sc.next();
        System.out.println("Dime el emisor: ");
        String emisor=sc.next();
        Factura f=new Factura(precio,emisor,cliente);
        
       f.imprimirFactura();
        
        
        
       
    }
    
}
