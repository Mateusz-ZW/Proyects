/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xd1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class XD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Videojuego v1=new Videojuego();
      
        int op;
        do{
            System.out.println("Menu:");
            System.out.println("1.Asignar titulo");
            System.out.println("2.Calcular precio");
            System.out.println("Seleccione una opcion: ");
            op=sc.nextInt();
            switch(op){
                case 1:
                   v1.asignarTitulo(sc);
                   break;
                case 2:
                    boolean nuevo=true;
                    double precio;
                    if(!nuevo){
                        
                        precio=15;
                        v1.calcularPrecio(precio);
                    }
                    else
                        precio=30;
                    v1.calcularPrecio(precio);
                    break;
                default: 
                    System.out.println("Opcion incorrecta");
            }
        }
        while(op!=2);
    }
    
}
