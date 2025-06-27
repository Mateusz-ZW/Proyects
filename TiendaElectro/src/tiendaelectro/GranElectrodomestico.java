/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaelectro;

/**
 *
 * @author mateo
 */
public class GranElectrodomestico extends Electrodomestico implements IEnvio{
    protected double peso;
    protected double alto;
    protected double ancho;
    protected double fondo;
    private static final int GASTOS_ENVIO=50;
   public GranElectrodomestico(Codigo c, String d, String f, 
			 String m, int s, double p, double peso, double alto,
			 double ancho, double fondo)
	{
		super(c,d,f,m,s,p);
		this.peso = peso;
		this.alto = alto;
		this.ancho = ancho;
		this.fondo = fondo;
	}
    
    @Override
    public double calcularPrecio() {
        return precio+gastosEnvio();
    }

    @Override
    public double gastosEnvio() {
        double res=peso*ancho*alto*fondo/1000000;
        if(res>GASTOS_ENVIO){
            return GASTOS_ENVIO;
        }
        else{
            return res;
        }
    }
    
}
