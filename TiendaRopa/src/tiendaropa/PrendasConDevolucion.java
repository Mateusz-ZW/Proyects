/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa;

/**
 *
 * @author mateo
 */
public class PrendasConDevolucion extends Prendas implements iDevolucion{
    protected final int DIAS=30;
	protected final int FIJO=4;
	protected final int DIVISOR = 10;
	
	public PrendasConDevolucion(Referencia r, String d, int c, double p, String t)
	{
		super(r,d,c,p,t);
	}
	
	public double devolver(int d)
	{
		if (d <=DIAS)
			return FIJO+(((double)d)/DIVISOR);
		return -1;
	}
}
