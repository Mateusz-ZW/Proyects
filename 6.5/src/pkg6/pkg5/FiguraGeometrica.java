/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg5;

/**
 *
 * @author mateo
 */
public abstract class FiguraGeometrica {
    protected double x;
    protected double y;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public abstract double area();
    public abstract double perimetro();
    public abstract void mostrar();
    
}
