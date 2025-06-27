/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg6;

/**
 *
 * @author mateo
 */
public abstract class Empleado {
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected int año;

    public Empleado() {
    }
    
    public Empleado(String dni, String nombre, String apellido, int año) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.año = año;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

  public abstract void imprimir();
    
  public abstract double obtenerSalario();
    
    
    
}
