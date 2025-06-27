/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sopa;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Sopa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int filas = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int columnas = sc.nextInt();

        System.out.print("Enter the number of words to search for: ");
        int numPalabras = sc.nextInt();

        SopaLetras sopa = new SopaLetras(filas, columnas, numPalabras);
        sopa.cargar();

        System.out.print("Enter a word to search for: ");
        String palabra = sc.next();
        int[] posicion = sopa.buscar(palabra);
        if (posicion[0] != -1) {
            System.out.println("The word " + palabra + " was found at position ("
                               + posicion[0] + ", " + posicion[1] + "), "
                               + "in direction " + posicion[2]);
        } else {
            System.out.println("The word " + palabra + " was not found");
        }

        char[][] solucion = sopa.resolver();
        for (int i = 0; i < solucion.length; i++) {
            for (int j = 0; j < solucion[i].length; j++) {
                System.out.println(solucion[i][j]);
            }
            System.out.println();
        }
    }
    }
    

