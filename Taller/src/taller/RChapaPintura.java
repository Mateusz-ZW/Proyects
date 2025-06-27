/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author mateo
 */
public class RChapaPintura extends Reparacion{
    private static double MULTI=1.3;
    public RChapaPintura(String d) {
        super(d);
    }

    @Override
    public double calcularPrecio() {
        return PRECIO_HORA+Matprecio*MULTI;
    }
    public String toString()
	{
		return "REPARACION CHAPA Y PINTURA\n"+super.toString();
	}
    
}
