/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa1;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public abstract class Articulo implements Serializable{
    protected Referencia ref;
    protected String desc;
    protected int cantidad;
    protected double precio;

    public Articulo(Referencia ref, String desc, int cantidad, double precio) {
        this.ref = ref;
        this.desc = desc;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Referencia getRef() {
        return ref;
    }

    public void setRef(Referencia ref) {
        this.ref = ref;
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
        return "Articulo{" + "ref=" + ref + ", desc=" + desc + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    
}
