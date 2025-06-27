package examenelectrodomesticos;

import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mateo
 */
public abstract class Electrodomesticos implements Serializable{
    protected Codigo codigo;
    protected String desc;
    protected String fabricante;
    protected String modelo;
    protected int stock;
    protected double precio;
    
    
    public Electrodomesticos(Codigo c, String d, String f, String m, int s, double p)
	 {
		 codigo = c;
		 desc = d;
		 fabricante = f;
		 modelo = m;
		 stock = s;
		 precio = p;
	 }

    public Codigo getCodigo() {
        return codigo;
    }

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public abstract double calcularPrecio();
    @Override
    public String toString() {
        return   "Codigo=" + codigo.toString() + ", desc=" + desc + ", fabricante=" + fabricante + ", modelo=" + modelo + ", stock=" + stock + ", precio=" + precio;
    }
    
    
    
    
}
