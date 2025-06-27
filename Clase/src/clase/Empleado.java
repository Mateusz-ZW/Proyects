/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Empleado extends Persona{
    private double sueldo;
    
    public Empleado(String nombre,int edad,double sueldo){
    super(nombre,edad);
    this.sueldo=sueldo;
}
    public void cargar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el sueldo: ");
        sueldo=sc.nextDouble();
    }
    public String toString(){
        return super.toString()+" y su sueldo es: "+sueldo;
    }
}
