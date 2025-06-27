/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.pkg1.pkg1;

/**
 *
 * @author mateo
 */
public class Triangulo {
    private double base;
    private double altura;
    
    public Triangulo(){
        this.base=1;
        this.altura=1;
    }
    public Triangulo(double base,double altura){
        this.altura=altura;
        this.base=base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setLados(double base,double altura){
        this.base=base;
        this.altura=altura;
    }
    public double perimetro(double altura,double base){
        return base+altura+Math.sqrt(base*base+altura*altura);
    }
    public double area(double altura,double base){
        return (base*altura)/2;
    }
}
