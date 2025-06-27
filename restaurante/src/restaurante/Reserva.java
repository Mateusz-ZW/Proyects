/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

import java.io.*;

/**
 *
 * @author mateo
 */
public abstract class Reserva implements Serializable {
    protected int id;
    protected String cliente;
    
    public Reserva(int anio,int sem,String cliente){
        this.id=generarId(anio,sem);
        this.cliente=cliente;
        
    }
    public static boolean semanaValida(int n){
            return (n>=1 && n<=53);
    }
    public int getID(){
        return id;
        
    }
    public static int generarId(int a,int sem){
        return a*100+sem;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", cliente=" + cliente + '}';
    }
    public abstract double calcularPrecio();
}
