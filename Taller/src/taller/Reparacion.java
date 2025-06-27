/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author mateo
 */
public abstract class Reparacion extends Trabajo implements IMaterial{
    protected int Matprecio=0;
    protected boolean finalizado=false;

    public Reparacion(String d) {
        super(d);
    }
    
    
    public void usarMaterial(double precio){
        if(!finalizado){
            Matprecio+=precio;
        }
        else{
            System.out.println("No se puede cambiar el precio del material utilizado");
        }
    }

    @Override
    public String toString() {
        return "Reparacion{" + "Matprecio=" + Matprecio + ", finalizado=" + finalizado + '}';
    }
    
    
}
