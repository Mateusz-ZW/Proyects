/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 *
 * @author mateo
 */
public class diaSemana {
     String nombre;
     int tarifa;
     double cantidad;

    public diaSemana(){
        
    }
    public diaSemana(String nombre, int tarifa, double cantidad) {
        this.nombre = nombre;
        this.tarifa = tarifa;
        this.cantidad = cantidad;
    }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

 
    
}
