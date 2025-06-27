/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionreparaciones;

/**
 *
 * @author mateo
 */
public class Revisiones extends Trabajo{
    private final double INC = 20;
	
	public Revisiones(String d) {
		super(d);
	}
	
	public double calcularPrecio()
	{
		return horas*PRECIO_HORA + INC;
	}

	public String toString()
	{
		return "REVISION\nCódigo: "+id+"\nDescripción: "+desc+"\nHoras: "+
	            horas+"\nPrecio: "+calcularPrecio();
	}

}
