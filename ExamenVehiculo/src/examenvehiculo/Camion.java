/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenvehiculo;

/**
 *
 * @author mateo
 */
public class Camion extends TCarga{
    private static final double EXTRA = 40;

	public Camion(Matricula m, String mar, String mod, int pma) {
		super(m, mar, mod, pma);

	}

	public double precio_alquiler(int dias)
	{
		return super.precio_alquiler(dias)+EXTRA;
	}
	public String toString()
	{
		return super.toString()+" CAMIÓN";
	}

}

