/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printacio;

import java.io.*;

/**
 *
 * @author mateo
 */
public class Filamento implements Precio,Serializable {
     protected String ref;
    protected String color;
    protected double peso;
    protected double precio;
    
    public Filamento(String r, String c, double p, double pr)
    {
        ref = r;
        color = c;
        peso = p;
        precio = pr;      
    }

    public String getRef() {
        return ref;
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    public double calcularPrecio(double peso)
    {
        return precio/1000*peso*1.3;
    }
    
    @Override
    public String toString()
    {
        return ref +"\t"+color+"\t"+peso+"kg\t"+precio+"€/kg";
    }

}
