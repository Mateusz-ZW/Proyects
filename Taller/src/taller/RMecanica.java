/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author mateo
 */
public class RMecanica extends Reparacion{
    private static double MULT=1.1;
    public RMecanica(String d) {
        super(d);
    }

    @Override
    public double calcularPrecio() {
        return horas*PRECIO_HORA+Matprecio*MULT;
    }
    
}
