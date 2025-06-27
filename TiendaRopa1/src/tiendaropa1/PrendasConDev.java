/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa1;

/**
 *
 * @author mateo
 */
public class PrendasConDev extends Prenda{
    protected final int DIAS=30;
    protected final int FIJO=4;
    protected final int DIVISOR = 10;
    
    public PrendasConDev(Referencia ref, String desc, int cantidad, double precio,String talla) {
        super(ref, desc, cantidad, precio,talla);
    }
    public double devolver(int d)
	{
		if (d <=DIAS)
			return FIJO+(((double)d)/DIVISOR);
		return -1;
	}
    
}

