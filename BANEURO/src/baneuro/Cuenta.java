/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baneuro;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public abstract class Cuenta implements Serializable{
    protected CCC cuenta;
    protected String nombre;
    protected String apellido;
    protected double saldo;

 public Cuenta (String n, String a, String entidad, String oficina, double saldo)
    {
        cuenta = new CCC(entidad, oficina);
        nombre = n;
        apellido = a;
        this.saldo = saldo;
    }
 public abstract boolean ingresar(double cant);
    public abstract boolean retirar(double cant);
    
    @Override
    public abstract String toString();
    
    public boolean igual(String c)
    {
        return cuenta.igual(c);
    }

    
}
