/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenelectrodomesticos;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public class ElectrodomesticosP extends Electrodomesticos implements Serializable{
    
    public ElectrodomesticosP(Codigo codigo, String desc, String fabricante, String modelo, int stock, double precio) {
        super(codigo, desc, fabricante, modelo, stock, precio);
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
    
}
