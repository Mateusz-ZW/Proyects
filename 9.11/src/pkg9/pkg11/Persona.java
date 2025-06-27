/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.pkg11;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public class Persona implements Serializable{
    private String nombre;
    private int edad;
    private DNI dni;
    
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        dni=new DNI();
    }
    public String toString(){
        return "Nombre: "+nombre+"edad: "+edad;
    }
}
