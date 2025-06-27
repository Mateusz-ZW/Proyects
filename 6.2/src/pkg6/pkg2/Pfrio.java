/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg2;

/**
 *
 * @author mateo
 */
public class Pfrio extends Producto{
    protected double tMantenimiento;

    public double gettMantenimiento() {
        return tMantenimiento;
    }

    public void settMantenimiento(double tMantenimiento) {
        this.tMantenimiento = tMantenimiento;
    }
    
    
    public void imprimir()
    {
        super.imprimir();
        System.out.println("Temperatura de mantenimiento: "+tMantenimiento);
    }
}
