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
public class ElectrodomesticosGSI extends ElectrodomesticosG implements Serializable{
    
    public ElectrodomesticosGSI(Codigo c, String d, String f, 
			 String m, int s, double p, double peso, double alto,
			 double ancho, double fondo)
	{
		super(c,d,f,m,s,p,peso,alto,ancho,fondo);
	}
   
    
}
