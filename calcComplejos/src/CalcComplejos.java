/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class CalcComplejos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Complejos a = new Complejos(2,5);
        Complejos b = new Complejos();
        b.setReal(4.6);
        b.setImag(3.5);
        Complejos suma=a.sumar(b);
        Complejos resta=a.restar(b);
        Complejos mult=a.multiplicar(b);
        Complejos mult2=a.multiplicar(5.2);
        Complejos div=a.dividir(b);
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(mult);
        System.out.println(mult2);
        System.out.println(div);
        if(a.equals(b)){
            System.out.println("Los dos numeros son iguales");
        }
    }
    
}
