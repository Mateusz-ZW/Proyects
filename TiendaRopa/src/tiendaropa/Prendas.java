/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa;

/**
 *
 * @author mateo
 */
public class Prendas extends Articulos {
    protected String talla;
    protected static String[] tallas_validas={"XS","S","M","L","XL","34","36","38","40","42","44"};

   public Prendas(Referencia r, String d, int c, double p, String t)
	{
		super(r,d,c,p);
		talla = t;
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
        return super.toString()+ "\nTalla=" + talla ;
    }
    
    
    
}
