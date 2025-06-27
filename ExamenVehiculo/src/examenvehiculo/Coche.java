/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenvehiculo;

/**
 *
 * @author mateo
 */
    public class Coche extends TPersona{
    public Coche(Matricula m, String mar, String mod, int plazas) {
		super(m, mar, mod, plazas);
	}
	
	public String toString()
	{
		return super.toString()+" COCHE";
	}

}


