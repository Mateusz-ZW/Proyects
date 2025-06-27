/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenel;

/**
 *
 * @author mateo
 */
public class ElectrodomesticoGI extends ElectrodomesticoG{
    private static final int COSTE_ADICIONAL=15;
    public ElectrodomesticoGI(Codigo codigo, String desc, String fab, String mod, int stock, double precio, double peso, double alto, double ancho, double fondo) {
        super(codigo, desc, fab, mod, stock, precio, peso, alto, ancho, fondo);
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio()+COSTE_ADICIONAL;
    }
}
