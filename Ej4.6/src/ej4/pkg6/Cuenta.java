/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4.pkg6;

/**
 *
 * @author mateo
 */
public class Cuenta {
    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;
    public Cuenta(){}
    public Cuenta(String nombre,String numeroCuenta,double tipoInteres,double saldo){
        this.nombre=nombre;
        this.numeroCuenta=numeroCuenta;
        this.tipoInteres=tipoInteres;
        this.saldo=saldo;
        
    }
    public Cuenta(Cuenta c){
        c.nombre=nombre;
        c.numeroCuenta=numeroCuenta;
        c.tipoInteres=tipoInteres;
        c.saldo=saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean ingreso(double saldo){
        if(tipoInteres>0){
        saldo+=tipoInteres;
        return true;
        }
        else
        return false;
    }
    public boolean reintegro(double saldo){
        if(saldo>0){
            saldo-=tipoInteres;
            return true;
        }
        else
        return false;
    }
    public boolean transferencia(Cuenta c,double a){
        return (this.reintegro(a)&&this.ingreso(a));
    }
     public void transferencia2(Cuenta c, double a)
    {
        if(this.reintegro(a))
            c.ingreso(a);
    }
}