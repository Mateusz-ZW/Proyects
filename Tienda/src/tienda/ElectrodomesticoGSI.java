/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author mateo
 */
public class ElectrodomesticoGSI extends ElectrodomesticosG{
    private final int COSTE_ADICIONAL=15;
    public ElectrodomesticoGSI(Codigo codigo, String desc, String fab, String mod, int stock, double precio, double peso, double alto, double ancho, double fondo) {
        super(codigo, desc, fab, mod, stock, precio, peso, alto, ancho, fondo);
    }
     @Override
    public double calcularPrecio() {
       return super.calcularPrecio()+COSTE_ADICIONAL;
    }
    
}
