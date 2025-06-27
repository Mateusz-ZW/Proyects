/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.pkg6;

/**
 *
 * @author mateo
 */
public class Producto {
    
    private String nombre;
    private int cantidad;
    private double precio;
    public static int cont=0;
    public Producto(){
        nombre="producto"+(cont++);
        cantidad=(int)(Math.random()*10+1);
        precio=(int)(Math.random()*10000+1)/(double)100;
    }
    public double getTotalPrecio(){
        return cantidad*precio;
        
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
}
