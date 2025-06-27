/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg5.pkg1;

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
        
        System.out.print("Tamaño: ");
        int t = sc.nextInt();
        System.out.print("Número menor: ");
        int menor = sc.nextInt();
        System.out.print("Número mayor: ");
        int mayor = sc.nextInt();
        
        VectInt v = new VectInt(t);
        v.cargar(menor, mayor);
        
        System.out.println(v);
        System.out.println("Promedio: "+v.promedio());
        System.out.println("Moda: "+v.moda());
        
        }
    }
    

