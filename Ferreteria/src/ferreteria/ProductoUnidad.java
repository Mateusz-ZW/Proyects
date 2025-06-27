/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferreteria;

/**
 *
 * @author mateo
 */
public class ProductoUnidad extends Producto{
     public ProductoUnidad(int referencia,String descripcion,double precio){
        super(referencia,descripcion,precio);
    }
    public String toString(){
        return super.toString()+"$/U";
    }
}
