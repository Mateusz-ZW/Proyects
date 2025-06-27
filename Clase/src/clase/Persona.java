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
public class Persona {
    private String nombre;
    private int edad;
    public Persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public void cargar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        nombre=sc.nextLine();
        System.out.println("Dime tu edad: ");
        edad=sc.nextInt();
    }
    public String toString(){
        return "Nombre: "+nombre+"edad: "+edad;
    }
}
