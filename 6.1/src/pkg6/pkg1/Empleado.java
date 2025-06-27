/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Empleado extends Persona {
    private double sueldo;
    public Empleado(){
        super();
    }
    public Empleado(String nombre,int edad,double sueldo){
        super(nombre,edad);
        this.sueldo=sueldo;
    }
    public void cargarSueldo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu sueldo: ");
        this.sueldo=sc.nextDouble();
    }
    public void imprimirSueldo(){
        System.out.println("El sueldo es: "+sueldo);
    }
    
}
