/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa1;

/**
 *
 * @author mateo
 */
public class Accesorio extends Articulo implements IDevolucion{
    protected final int DIAS=30;
    protected final int FIJO=4;
    protected final int DIVISOR = 10;
    public Accesorio(Referencia ref, String desc, int cantidad, double precio) {
        super(ref, desc, cantidad, precio);
    }

    @Override
    public double devolver(int dias) {
        if(dias<DIAS){
            return FIJO+((double)dias)/DIVISOR;
        }
        return -1;
    }
    
    
}
