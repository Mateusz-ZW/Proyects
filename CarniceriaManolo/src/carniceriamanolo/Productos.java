/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carniceriamanolo;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public class Productos implements Serializable{
    protected int codigo;
    protected String desc;
    protected int stock;
    protected double precio;

    public Productos(int codigo, String desc, int stock, double precio) {
        this.codigo = codigo;
        this.desc = desc;
        this.stock = stock;
        this.precio = precio;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
     public String toString()
    {
        return codigo+"\t"+desc+"\t"+stock+" unidades\t"+precio+" €";
    }
    
    
}
