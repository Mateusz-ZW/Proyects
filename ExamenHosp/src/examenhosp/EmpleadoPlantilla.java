/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenhosp;

/**
 *
 * @author mateo
 */
public class EmpleadoPlantilla extends Empleado{
    protected double salarioB;
    protected double porcentajeExtra;

    public EmpleadoPlantilla() {
        super();
    }

    public EmpleadoPlantilla(String dni, String nombre, String apellido, int codigo, int horasExtra, double salarioB, int porcentajeExtra) {
        super(dni, nombre, apellido, codigo, horasExtra);
        this.salarioB = salarioB;
        this.porcentajeExtra = porcentajeExtra;
    }
    
    
    @Override
    public void mostrar() {
        System.out.println("DATOS DEL EMPLEADO");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("APELLIDO: "+apellido);
        System.out.println("CODIGO: "+codigo);        
        System.out.println("SALARIO TOTAL: "+salario());
    }

    @Override
    public double salario() {
        double porc=porcentajeExtra*horasExtra;
         return salarioB+salarioB*porc/100;
    }
}
