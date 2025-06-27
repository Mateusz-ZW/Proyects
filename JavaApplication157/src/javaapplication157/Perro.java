/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication157;

/**
 *
 * @author mateo
 */
public class Perro extends Animal{
    private String raza;
    
    public Perro(){
        super();
    }
    public Perro(String nombre, int edad,String raza){
        super(nombre,edad);
        this.raza=raza;
    }

    @Override
    public String toString() {
        return super.toString()+"Y la raza del perro es: "+raza;
    }
    
}
