/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluditos;

/**
 *
 * @author mateo
 */
public class Perro extends Animal{
    public Perro(String nombre,int edad){
        super(nombre,edad);
        
    }
    public String toString(){
        return "Perro: "+super.toString();
    }
}
