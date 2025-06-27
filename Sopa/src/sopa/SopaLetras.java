/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopa;

/**
 *
 * @author mateo
 */

import java.util.Scanner;
public class SopaLetras {
     private char[][] sopa;
    private String[] palabras;
//Le ponemos un limite a nuestos arrays
    public SopaLetras(int alto, int ancho, int numPalabras) {
        sopa = new char[alto][ancho];
        palabras = new String[numPalabras];
    }

    public void cargar() {
        //Importamos Scanner para preguntar por consola
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                sopa[i][j] = sc.next().charAt(0);
            }
        }//Aqui todos los datos que ponga el usuario los almacenará en el array
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = sc.next();
        }
    }

    public void cargar(char[][] sopa, String[] palabras) {
        this.sopa = sopa;
        this.palabras = palabras;
    }
    //Con este metodo buscaremos la palabra llamando a nuestro metodo buscarPalabra
    public int[] buscar(String palabra) {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
              int[] posicion = buscarPalabra(palabra, i, j, 0);
              if (posicion != null) {
              return posicion;
          }
       }
     }
        return new int[]{-1, -1, -1};
    }

    private int[] buscarPalabra(String palabra, int fila, int columna, int direccion) {
        if (palabra.isEmpty()) {
            return new int[]{fila, columna, direccion};
        }
        if (fila < 0 || fila >= sopa.length || columna < 0 || columna >= sopa[fila].length) {
            return null;
        }
        if (sopa[fila][columna] != palabra.charAt(0)) {
            return null;
        }
        for (int[] despl: new int[][]{{-1, 0, 0}, {-1, 1, 1}, {0, 1, 2}, {1, 1, 3}, {1, 0, 4}, {1, -1, 5}, {0, -1, 6}, {-1, -1, 7}}) {
            int[] posicion = buscarPalabra(palabra.substring(1), fila + despl[0], columna + despl[1], despl[2]);
            if (posicion != null) {
                return posicion;
            }
        }
        return null;
    }//Con este metodo recorremos todo nuestro array y le decimos la forma en la que se muestre
     public char[][] resolver() {
        char[][] solucion = new char[sopa.length][sopa[0].length];
        for (int i = 0; i < solucion.length; i++) {
            for (int j = 0; j < solucion[i].length; j++) {
                solucion[i][j] = '-';
            }
        }

        for (String palabra : palabras) {
            int[] posicion = buscar(palabra);
            if (posicion[0] != -1) {
                solucion[posicion[0]][posicion[1]] = palabra.charAt(0);
            }
        }

        return solucion;
    
}
}

