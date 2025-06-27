/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5.pkg2;

/**
 *
 * @author mateo
 */
public class Rectangulo {
    private double base;
    private double altura;
    public Rectangulo(){
    base=1;
    altura=1;
    }
    public Rectangulo(double base,double altura){
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
    public double perimetro(){
        return 2*this.base+2*this.altura;
    }
    public double area(){
        return this.altura*this.base;
    }
    
}
