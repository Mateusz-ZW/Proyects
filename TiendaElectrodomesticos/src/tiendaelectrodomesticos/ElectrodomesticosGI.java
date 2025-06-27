/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaelectrodomesticos;

/**
 *
 * @author mateo
 */
public class ElectrodomesticosGI extends ElectrodomesticosG{

    public ElectrodomesticosGI() {
        super();
        
    }

    public ElectrodomesticosGI(Codigo c, String d, String f, 
			 String m, int s, double p, double peso, double alto,
			 double ancho, double fondo) {
        super(c,d,f,m,s,p,peso,alto,ancho,fondo);
    }
     public double precio() {
        return super.calcularEnvio()+15;
    }
    
    
}
