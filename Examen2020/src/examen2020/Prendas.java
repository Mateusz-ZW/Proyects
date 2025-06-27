/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2020;

/**
 *
 * @author mateo
 */
public class Prendas extends Articulo{
    
    protected String talla;
    protected static String[] tallas_validas={"XS","S","M","L","XL","34","36","38","40","42","44"};

    public Prendas(Referencia referencia, String desc, int cantidad, double precio,String talla) {
        super(referencia, desc, cantidad, precio);
        this.talla=talla;
    }
    public static boolean tallaValida(String talla){
        for(int i=0;i<tallas_validas.length;i++){
            if(tallas_validas[i].equals(talla)){
                return true;
            }
            
        }
        return false;
    }
    @Override
    public String toString() {
        return "Prendas{" + "talla=" + talla + '}';
    }
    
    
}
