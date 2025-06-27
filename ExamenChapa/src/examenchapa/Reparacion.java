/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenchapa;

/**
 *
 * @author mateo
 */
public abstract class Reparacion extends Trabajo implements IMaterial{
    protected double costeMaterial=0;
    public Reparacion(String d)
	{
		super(d);
	}
	
	public void usarMaterial(double p)
	{
		if (!finalizado)
			costeMaterial+=p;
		else
			System.out.println("No puedo añadir material en un trabajo finalizado");
	}
	
	public String toString()
	{
		return "Código: "+codigo+"\nDescripción: "+desc+"\nHoras: "+
	            horas+"\nMaterial: "+costeMaterial+"\nPrecio: "+
				calcularPrecio();
	}

}


