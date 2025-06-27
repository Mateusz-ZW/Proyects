/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenvehiculo;

/**
 *
 * @author mateo
 */
public class TCarga extends Vehiculo implements Facturable{
    protected int pma;
	protected static final double SUPCARGA = 20;
	
	public TCarga(Matricula m, String mar, String mod, int pma) {
		super(m, mar, mod);
		this.pma = pma;
		
	}
	
	public void generarFactura()
	{
		System.out.println("Generando factura  "
				+ "para el vehículo con matrícula "+matricula);
	}
	
	public double precio_alquiler(int dias)
	{
		return BASE*dias+pma*SUPCARGA;
	}
	
	public String toString()
	{
		return super.toString()+" "+pma;
	}

}
