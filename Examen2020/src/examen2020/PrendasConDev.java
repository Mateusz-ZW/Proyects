/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2020;

/**
 *
 * @author mateo
 */
public class PrendasConDev extends Prendas{
    protected final int DIAS=30;
    protected final int FIJO=4;
    protected final int DIVISOR = 10;
    
    public PrendasConDev(Referencia referencia, String desc, int cantidad, double precio, String talla) {
        super(referencia, desc, cantidad, precio, talla);
    }
    

     public double devolver(int d)
     {
	if (d <=DIAS){
	return FIJO+(((double)d)/DIVISOR);
        }
	return -1;
     }

}
    

