/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferreteria;

/**
 *
 * @author mateo
 */
public class ProductoPeso extends Producto implements AIPeso{
    public ProductoPeso(int referencia,String descripcion,double precio){
        super(referencia,descripcion,precio);
    }
    public String toString(){
        return super.toString()+"$/Kg";
    }
    public double calcularPrecio(int g){
        return g*precio/1000;
    }
    
}
