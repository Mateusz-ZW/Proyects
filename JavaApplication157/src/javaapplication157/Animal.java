/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication157;

/**
 *
 * @author mateo
 */
public class Animal {
    private String nombre;
    private int edad;
    public Animal(){}
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad;
    }
    
    
}
