/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2020;

/**
 *
 * @author mateo
 */
public class Accesorio extends Articulo implements IDevolucion{
    protected final int DIAS=30;
    protected final int IMPORTE=4;
    protected final int DIV=10;
    public Accesorio(Referencia referencia, String desc, int cantidad, double precio) {
        super(referencia, desc, cantidad, precio);
    }

    @Override
    public double devolver(int dias) {
        if(dias<DIAS){
            return IMPORTE+(double)dias/DIV;
        }
        else{
            return -1;
        }
    }

   
    
    
}
