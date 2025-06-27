/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenelectrodomesticos;

/**
 *
 * @author mateo
 */
public abstract class ElectrodomesticosG extends Electrodomesticos implements IEnvio{
    protected double peso;
    protected double alto;
    protected double ancho;
    protected double fondo;
    private static final int GASTOS_ENVIO=50;

  public ElectrodomesticosG(Codigo c, String d, String f, String m, int s, double p, double peso, double alto, double ancho, double fondo)
	{
		super(c,d,f,m,s,p);
		this.peso = peso;
		this.alto = alto;
		this.ancho = ancho;
		this.fondo = fondo;
	}
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getFondo() {
        return fondo;
    }

    public void setFondo(double fondo) {
        this.fondo = fondo;
    }

    @Override
    public double calcularGastosEnvio() {
        double res=peso*ancho*alto*fondo/1000000;
        if(res>GASTOS_ENVIO){
            return GASTOS_ENVIO;
        }
        else{
            return res;
        }
       
    }

    @Override
    public double calcularPrecio() {
        return precio*calcularGastosEnvio();
    }
    @Override
    public String toString() {
        return super.toString()+"ElectrodomesticosG{" + "peso=" + peso + ", alto=" + alto + ", ancho=" + ancho + ", fondo=" + fondo + '}';
    }
    
    
    
}
