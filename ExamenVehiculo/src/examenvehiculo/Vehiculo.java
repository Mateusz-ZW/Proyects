/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenvehiculo;

/**
 *
 * @author mateo
 */
public abstract class Vehiculo {
    protected Matricula matricula;
    protected String marca;
    protected String modelo;
    protected static final double BASE = 50;
    public Vehiculo(Matricula m, String mar, String mod)
	{
		this.matricula = m;
		this.marca = mar;
		this.modelo = mod;
	}
	
	public Matricula getMatricula()
	{
		return matricula;
	}
        public abstract double precio_alquiler(int dias);
	public String toString()
	{
		return matricula+" "+marca+" "+modelo;
	}
}
