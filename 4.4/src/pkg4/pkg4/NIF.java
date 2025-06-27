/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.pkg4;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class NIF {

   
    //Clase NIF

public class Nif {

    private int dni;
    private char letra;

    //Constructores
    public Nif() {
    }

    public Nif(int dni) {
        this.dni = dni;
        letra = calcularLetra();
    }

    //Método para calcular la letra del NIF
    private char calcularLetra() {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X','B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};                      
        return letras[dni % 23];
    }

    //Método para leer por teclado el número de DNI y calcular la letra
    public void leer() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce dni: ");
            dni = sc.nextInt();
        } while (dni <= 0);
        letra = calcularLetra();
    }

    //Método que devuelve un String de la forma 99999999-X
    
    public String toString() {
        StringBuilder texto = new StringBuilder();
        texto.append(dni);
        texto.append("-");
        texto.append(letra);
        return texto.toString();
    }

}
}
