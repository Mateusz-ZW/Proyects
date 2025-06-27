/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferreteria;

/**
 *
 * @author mateo
 */
public class Producto {
    protected int referencia;
    protected String descripcion;
    protected double precio;
    
    public Producto(){
        
    }
    public Producto(int referencia,String descripcion,double precio){
        this.referencia=referencia;
        this.descripcion=descripcion;
        this.precio=precio;
        
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "referencia=" + referencia + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
}
