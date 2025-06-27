/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaelectrodomesticos;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public abstract class Electrodomesticos implements Serializable{
    protected Codigo codigo;
    protected String descripcion;
    protected String fabricante;
    protected String modelo;
    protected int stock;
    protected double precioU;

    public Electrodomesticos() {
    }
    
    
    public Electrodomesticos(Codigo codigo, String descripcion, String fabricante, String modelo, int stock, double precioU) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.stock = stock;
        this.precioU = precioU;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioU() {
        return precioU;
    }

    public void setPrecioU(double precioU) {
        this.precioU = precioU;
    }
    
    public abstract double precio();
     public String toString()
	 {
		 return "Código: "+codigo.toString()+
				 "\nDescripción: "+descripcion +
				 "\nFabricante: "+fabricante +
				 "\nModelo: "+ modelo +
				 "\nStock: "+stock +
				 "\nPrecio: "+precio();
	 }
    
}
