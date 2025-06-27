/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenchapa;

/**
 *
 * @author mateo
 */
public class Revision extends Trabajo{
    private final double INC = 20;
    public Revision(String desc) {
        super(desc);
    }
    public double calcularPrecio()
	{
		return horas*PRECIO_HORA + INC;
	}

	public String toString()
	{
		return "REVISION\nCódigo: "+codigo+"\nDescripción: "+desc+"\nHoras: "+
	            horas+"\nPrecio: "+calcularPrecio();
	}
   
    
}
