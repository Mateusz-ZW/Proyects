/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa;

/**
 *
 * @author mateo
 */
public class Accesorios extends Articulos implements iDevolucion {
    protected final int DIAS=30;
	protected final int FIJO=4;
	protected final int DIVISOR = 10;
	
	public Accesorios(Referencia r, String d, int c, double p)
	{
		super(r,d,c,p);
	}
	
	public double devolver(int d)
	{
		if (d <=DIAS)
			return FIJO+(((double)d)/DIVISOR);
		return -1;
	}
}

