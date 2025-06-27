/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2020;

/**
 *
 * @author mateo
 */
public abstract class Articulo {
    protected Referencia referencia;
    protected String desc;
    protected int cantidad;
    protected double precio;

    public Articulo(Referencia referencia, String desc, int cantidad, double precio) {
        this.referencia = referencia;
        this.desc = desc;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Referencia getReferencia() {
        return referencia;
    }

    public void setReferencia(Referencia referencia) {
        this.referencia = referencia;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    @Override
    public String toString() {
        return "Articulo{" + "referencia=" + referencia + ", desc=" + desc + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    
}
