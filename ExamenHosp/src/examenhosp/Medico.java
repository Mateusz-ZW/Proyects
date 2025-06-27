/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenhosp;

/**
 *
 * @author mateo
 */
public class Medico extends EmpleadoPlantilla{
    protected String especialidad;

    public Medico() {
        super();
    }

    public Medico(String dni, String nombre, String apellido, int codigo, int horasExtra, double salarioB, int porcentajeExtra, String especialidad) {
        super(dni, nombre, apellido , codigo, horasExtra,salarioB, porcentajeExtra);
        this.especialidad = especialidad;
    }
     @Override
    public void mostrar() {
          
        System.out.println("DATOS DEL EMPLEADO");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("APELLIDO: "+apellido);
        System.out.println("CODIGO: "+codigo);    
        System.out.println("ESPECIALIDAD: "+especialidad);
        System.out.println("SALARIO TOTAL: "+salario());
    
    }

    @Override
    public double salario() {
       return salarioB;
    }
    
    
}
