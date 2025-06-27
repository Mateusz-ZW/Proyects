/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg3;

/**
 *
 * @author mateo
 */
public class Directivo extends Empleado{
     public Directivo(String nombre){
        super(nombre);
    }
    public String toString(){
       return"Directivo:" +super.toString();
    }
}

