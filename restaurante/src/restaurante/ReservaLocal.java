/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author mateo
 */
public class ReservaLocal  extends Reserva{
    private static final double PRECIO=250;
    
    public ReservaLocal(int a,int s,String c){
        super(a,s,c);
    }
    public double calcularPrecio(){
       return PRECIO;
    }

    @Override
    public String toString() {
        return super.toString()+calcularPrecio();
    }
    
}
