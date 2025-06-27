/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5.pkg1;

/**
 *
 * @author mateo
 */
public class Circulo {
    private double radio;
    public Circulo(){
    radio=1;}
    public Circulo(double radio){
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double perimetro(){
        return 2*Math.PI*this.radio;
    }
    public double area(){
        return Math.PI*Math.pow(this.radio, 2);
    }
    
}
