/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenhosp;

/**
 *
 * @author mateo
 */
public abstract class Empleado extends Persona {
    protected int codigo;
    protected int horasExtra;

    public Empleado() {
        super();
    }

    public Empleado(String dni, String nombre, String apellido, int codigo, int horasExtra) {
        super(dni, nombre, apellido);
        this.codigo = codigo;
        this.horasExtra = horasExtra;
    }
    
    public abstract double salario();
    
}
