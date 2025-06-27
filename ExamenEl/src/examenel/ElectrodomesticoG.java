/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenel;

/**
 *
 * @author mateo
 */
public abstract class ElectrodomesticoG extends Electrodomestico implements IEnvio{
    protected double peso;
    protected double alto;
    protected double ancho;
    protected double fondo;
    protected final int GASTOS_ENVIO=50;
    
    public ElectrodomesticoG(Codigo codigo, String desc, String fab, String mod, int stock, double precio,double peso,double alto,double ancho,double fondo) {
        super(codigo, desc, fab, mod, stock, precio);
        this.peso=peso;
        this.alto=alto;
        this.ancho=ancho;
        this.fondo=fondo;
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
    public double gastosEnvio() {
        double res=peso*alto*ancho*fondo/1000000;
        if(res>GASTOS_ENVIO){
            return GASTOS_ENVIO;
        }
        else{
            return res;
        }
    }
    public double calcularPrecio(){
        return precio+gastosEnvio();
    }
    @Override
    public String toString() {
        return "ElectrodomesticoG{" + "peso=" + peso + ", alto=" + alto + ", ancho=" + ancho + ", fondo=" + fondo + '}';
    }

    
    
    
}
