/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenvehiculo;

/**
 *
 * @author mateo
 */
public class Furgoneta extends TCarga{
    public Furgoneta(Matricula m, String mar, String mod, int pma) {
		super(m, mar, mod, pma);
		
	}

	public String toString()
	{
		return super.toString()+" FURGONETA";
	}

}
