/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenvehiculo;

/**
 *
 * @author mateo
 */
public class MicroBus extends TPersona{
    private static final double SUPLEMENTO=2;
	
	public MicroBus(Matricula m, String mar, String mod, int plazas) {
		super(m, mar, mod, plazas);

	}
	
	public double precio_alquiler(int dias)
	{
		return super.precio_alquiler(dias)+SUPLEMENTO*plazas;
	}
	
	public String toString()
	{
		return super.toString()+" MICROBÚS";
	}


}
