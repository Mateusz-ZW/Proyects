/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg5;

/**
 *
 * @author mateo
 */
public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo() {
        super();
    }

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    @Override
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
    @Override
    public double perimetro(){
        return 2*Math.PI*radio;
    }

    @Override
    public void mostrar() {
        System.out.println("");
    }
    

    
    
}
