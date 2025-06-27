/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.pkg1ej;

/**
 *
 * @author mateo
 */
public class Circulo {
    private double radio;
    
    public Circulo(){
        radio=1;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double perimetro(double radio){
        return (2*radio)*Math.PI;
    }
    public double area(double radio){
        return Math.PI*Math.pow(radio, 2);
    }
}
