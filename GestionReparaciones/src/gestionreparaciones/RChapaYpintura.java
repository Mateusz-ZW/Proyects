/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionreparaciones;

/**
 *
 * @author mateo
 */
public class RChapaYpintura extends Reparaciones{
    private final double MULT = 1.3;
	
	public RChapaYpintura(String d)
	{
		super(d);
	}
	
	public double calcularPrecio()
	{
		return horas*PRECIO_HORA + costeMaterial*MULT;
	}
	
	public String toString()
	{
		return "REPARACION CHAPA Y PINTURA\n"+super.toString();
	}
}
