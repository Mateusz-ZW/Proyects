/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenelectrodomesticos;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public class ElectrodomesticosGI extends ElectrodomesticosG implements Serializable{
    private final static int COSTE_ADICIONAL=15;
    
    public ElectrodomesticosGI(Codigo c, String d, String f, String m, int s, double p, double peso, double alto, double ancho, double fondo)
	{
		super(c,d,f,m,s,p,peso,alto,ancho,fondo);
	}
    @Override
     public double calcularPrecio() {
        return super.calcularPrecio()+COSTE_ADICIONAL;
    }
    
}
