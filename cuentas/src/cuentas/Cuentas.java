/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentas;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Cuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
String nombre, numero;
double tipo, importe;
//se crea objeto cuenta1 sin parámetros
//se ejecuta el constructor por defecto
Cuenta cuenta1 = new Cuenta();
System.out.print("Nombre : ");
nombre = sc.nextLine();
System.out.print("Número de cuenta : ");
numero = sc.nextLine();
System.out.print("Tipo de interes : ");
tipo = sc.nextDouble();
System.out.print("Saldo: ");
importe = sc.nextDouble();
cuenta1.setNombre(nombre);
cuenta1.setNumero(numero);
cuenta1.setInteres(tipo);
cuenta1.setSaldo(importe);
//se crea el objeto cuenta2 con los valores leidos por teclado
//se ejecuta el constructor con parámetros
Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
//se crea cuenta3 como copia de cuenta1
//se ejecuta el constructor copia
Cuenta cuenta3 = new Cuenta(cuenta1);
//mostrar los datos de cuenta1
System.out.println("Datos de la cuenta 1");
System.out.println("Nombre del titular: " + cuenta1.getNombre());
System.out.println("Número de cuenta: " + cuenta1.getNumero());
System.out.println("Tipo de interés: " + cuenta1.getInteres());
System.out.println("Saldo: " + cuenta1.getSaldo());
System.out.println();
       
//se realiza un ingreso en cuenta1
cuenta1.ingreso(4000);
       
//mostrar el saldo de cuenta1 después del ingreso
System.out.println("Saldo: " + cuenta1.getSaldo());
       
//mostrar los datos de cuenta2
System.out.println("Datos de la cuenta 2");
System.out.println("Nombre del titular: " + cuenta2.getNombre());
System.out.println("Número de cuenta: " + cuenta2.getNumero());
System.out.println("Tipo de interés: " + cuenta2.getInteres());
System.out.println("Saldo: " + cuenta2.getSaldo());
System.out.println();
       
//mostrar los datos de cuenta3
System.out.println("Datos de la cuenta 3");
System.out.println("Nombre del titular: " + cuenta3.getNombre());
System.out.println("Número de cuenta: " + cuenta3.getNumero());
System.out.println("Tipo de interés: " + cuenta3.getInteres());
System.out.println("Saldo: " + cuenta3.getSaldo());
System.out.println();
       
//realizar una transferencia de 10€ desde cuenta3 a cuenta2
cuenta3.transferencia(cuenta2, 10);
       
//mostrar el saldo de cuenta2
System.out.println("Saldo de la cuenta 2");
System.out.println("Saldo: " + cuenta2.getSaldo());
System.out.println();
       
//mostrar el saldo de cuenta3
System.out.println("Saldo de la cuenta 3");
System.out.println("Saldo: " + cuenta3.getSaldo());
System.out.println();
}
    }
    
}
