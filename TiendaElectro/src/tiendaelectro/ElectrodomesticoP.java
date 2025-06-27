/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaelectro;

/**
 *
 * @author mateo
 */
public class ElectrodomesticoP extends Electrodomestico{

    public ElectrodomesticoP(Codigo c, String d, String f, String m, int s, double p) {
        super(c, d, f, m, s, p);
    }

  
   

    @Override
    public double calcularPrecio() {
        return precio;
    }
    
}
