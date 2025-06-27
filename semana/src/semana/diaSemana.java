/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana;

/**
 *
 * @author mateo
 */
public class diaSemana {
      //atributos
    private String  nombre;
    private int tarifa;
    private double cantidad;

    //constructores
    public diaSemana () {

    }
    public diaSemana (String nombre, int tarifa, double cantidad) {
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.tarifa=tarifa;
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

     // Método para mostrar información del objeto
    public String toString() {
        return "Día: " + nombre + ", Tarifa: " + tarifa + ", Cantidad: " + cantidad;
    }


}

