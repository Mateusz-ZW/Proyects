/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public abstract class Articulos implements Serializable{
    protected Referencia referencia;
    protected String descripcion;
    protected int cantidad;
    protected double precio;

    public Articulos() {
    }
    
    public Articulos(Referencia referencia, String descripcion, int cantidad, double precio) {
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Referencia getReferencia() {
        return referencia;
    }

    public void setReferencia(Referencia referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean equals(Articulos a)
	{
		return a.referencia==this.referencia;
	}
    public boolean equals(String n)
	{
	   return this.referencia.equals(n);
	}
    public String toString()
	{
		return "Referencia: "+referencia+
				"\nDescripción: "+descripcion+
				"\nCantidad: "+cantidad+
				"\nPrecio: "+precio;
	}

    
}
