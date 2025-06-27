/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentiendae;

/**
 *
 * @author mateo
 */
public class ElectrodomesticoGI extends ElectrodomesticoG {
    private static final int COSTE_ADICIONAL=15;
    public ElectrodomesticoGI(Codigo c, String desc, String fab, String mod, int stock, double precio, double peso, double alto, double ancho, double fondo) {
        super(c, desc, fab, mod, stock, precio, peso, alto, ancho, fondo);
    }
     @Override
    public double calcularPrecio() {
        return precio+gastosEnvio()+COSTE_ADICIONAL;
    }

}
