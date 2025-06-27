/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaelectro;

/**
 *
 * @author mateo
 */
public class ElectrodomesticoGI extends GranElectrodomestico{
    private final int COSTE_ADICIONAL=15;
   public ElectrodomesticoGI(Codigo c, String d, String f, 
			 String m, int s, double p, double peso, double alto,
			 double ancho, double fondo)
	{
		super(c,d,f,m,s,p,peso,alto,ancho,fondo);
	}
    public double calcularPrecio(){
        return super.calcularPrecio()+COSTE_ADICIONAL;
    }
    
}
