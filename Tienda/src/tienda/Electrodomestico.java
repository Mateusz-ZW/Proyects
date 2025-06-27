/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public abstract class Electrodomestico implements Serializable{
    protected Codigo codigo;
    protected String desc;
    protected String fab;
    protected String mod;
    protected int stock;
    protected double precio;

    public Electrodomestico(Codigo codigo, String desc, String fab, String mod, int stock, double precio) {
        this.codigo = codigo;
        this.desc = desc;
        this.fab = fab;
        this.mod = mod;
        this.stock = stock;
        this.precio = precio;
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

    public String getFab() {
        return fab;
    }

    public void setFab(String fab) {
        this.fab = fab;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
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
        return "Electrodomestico{" + "codigo=" + codigo + ", desc=" + desc + ", fab=" + fab + ", mod=" + mod + ", stock=" + stock + ", precio=" + precio + '}';
    }
    
    
    
    
}
