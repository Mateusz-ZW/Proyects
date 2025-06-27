/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5.pkg2;

/**
 *
 * @author mateo
 */
public class Triangulo {
    private double base;
    private double altura;
    public Triangulo(){
    base=1;
    altura=1;
    }
    public Triangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
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
    public double perimetro(){
        double h=0;
        h=Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
        return h;
    }
    public double area(){
        return (this.base*this.altura)/2;
    }
    
}
