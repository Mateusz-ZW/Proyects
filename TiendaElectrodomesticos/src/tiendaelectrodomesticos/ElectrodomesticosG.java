/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaelectrodomesticos;

/**
 *
 * @author mateo
 */
public class ElectrodomesticosG extends Electrodomesticos implements IEnvio{
    protected double peso;
    protected double alto;
    protected double ancho;
    protected double fondo;
    private static int PRECIO_ENVIO=50;

    public ElectrodomesticosG() {
       super();
    }

    public ElectrodomesticosG(Codigo c, String d, String f, 
			 String m, int s, double p, double peso, double alto,
			 double ancho, double fondo) {
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

    public static int getPRECIO_ENVIO() {
        return PRECIO_ENVIO;
    }

    public static void setPRECIO_ENVIO(int PRECIO_ENVIO) {
        ElectrodomesticosG.PRECIO_ENVIO = PRECIO_ENVIO;
    }
    
    
    @Override
    public double calcularEnvio() {
        double resultado= peso*ancho*alto*fondo/1000000;
        if(resultado>50){
            return PRECIO_ENVIO;
        }
        else{
            return resultado;
        }
    }

    @Override
    public double precio() {
        return precioU*calcularEnvio();
    }
    public String toString()
	{
        return super.toString()+
			"\nPeso: "+peso+
			"\nAlto: "+alto+
			"\nAncho: "+ancho+
			"\nFondo: "+fondo;
	}
    
}
