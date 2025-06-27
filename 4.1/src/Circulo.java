/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mateo
 */
public class Circulo {
     final double PI=3.14159;
    private double radio;
    

public Circulo(){
radio=1;
}
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
        double longitud;
       
        longitud=2*PI*this.radio;
        return longitud;
    }
    public double area(){
        double a;
        a=PI*Math.pow(this.radio, 2);
        return a;
    }

}