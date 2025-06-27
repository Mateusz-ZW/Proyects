/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author mateo
 */
public class ElectrodomesticoP extends Electrodomestico {
    
    public ElectrodomesticoP(Codigo codigo, String desc, String fab, String mod, int stock, double precio) {
        super(codigo, desc, fab, mod, stock, precio);
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
    
}
