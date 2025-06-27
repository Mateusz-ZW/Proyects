/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaelectrodomesticos;

/**
 *
 * @author mateo
 */
public class ElectrodomesticosP extends Electrodomesticos{

    public ElectrodomesticosP(Codigo codigo, String descripcion, String fabricante, String modelo, int stock, double precioU) {
        super(codigo, descripcion, fabricante, modelo, stock, precioU);
    }
    
    @Override
    public double precio() {
        return precioU;
    }
    
}
