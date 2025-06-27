/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenvehiculo;

/**
 *
 * @author mateo
 */
public class TPersona extends Vehiculo{
    
	protected int plazas;
	
	protected static final double SUMA = 1.5;
	
	public TPersona(Matricula m, String mar, String mod, int plazas) {
		super(m, mar, mod);
		this.plazas = plazas;
		
	}
	
	public double precio_alquiler(int dias)
	{
		return BASE*dias+SUMA*plazas*dias;
	}
	
	public String toString()
	{
		return super.toString()+" "+plazas;
	}
	
}
