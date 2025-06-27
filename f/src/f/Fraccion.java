/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f;

/**
 *
 * @author mateo
 */
public class Fraccion {
    private int numerador;
    private int denominador;
    public Fraccion(){
        numerador = 0;
        denominador = 1;
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }
      public Fraccion(int numerador, int denominador)
    {
        numerador = numerador;
        denominador = denominador;
        simplificar();
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    private int mcd(){
     int u=Math.abs(numerador);
     int v=Math.abs(denominador);
     if(v==0){
          return u;
     }
     int r;
     while(v!=0){
          r=u%v;
          u=v;
          v=r;
     }
     return u;
}
    public void simplificar(){
       int n= mcd();
       
       numerador=numerador/n;
       denominador=denominador/n;
    } public Fraccion sumar(Fraccion f)
    {
        return new Fraccion (this.numerador*f.denominador+this.denominador*f.numerador,this.denominador*f.denominador);
    }
    public Fraccion restar(Fraccion f)
    {
        return new Fraccion (this.numerador*f.denominador-this.denominador*f.numerador,this.denominador*f.denominador);
    }
    public Fraccion multiplicar(Fraccion f)
    {
        return new Fraccion (this.numerador*f.numerador,this.denominador*f.denominador);
    }
    public Fraccion dividir(Fraccion f)
    {
        return new Fraccion(this.numerador*f.denominador,this.denominador*f.numerador);
    }
    
    @Override
    public String toString()
    {

        return numerador+"/"+denominador;
    }
    
}
