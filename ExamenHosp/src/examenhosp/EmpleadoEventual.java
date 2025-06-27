/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenhosp;

/**
 *
 * @author mateo
 */
public class EmpleadoEventual extends Empleado {
    protected double honorariosHora;
    protected double nHoras;

    public EmpleadoEventual() {
        super();
    }

    public EmpleadoEventual(String dni, String nombre, String apellido,int codigo, int horasExtra,double honorarioHora, int nHoras) {
        super(dni, nombre, apellido, codigo, horasExtra);
        this.honorariosHora = honorariosHora;
        this.nHoras = nHoras;
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
      
      return nHoras*honorariosHora+2*nHoras*honorariosHora;
    }
}
    

