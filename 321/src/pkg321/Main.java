/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg321;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int leerNumero(){
        Scanner sc=new Scanner(System.in);
        int valor= sc.nextInt();
        return valor;
    }
    public static void escribir(String texto){
        System.out.println(texto);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        escribir("Introduce un valor");
        int valor=leerNumero();
        escribir("El valor es: "+ valor);
        // TODO code application logic here
    }
    
}
