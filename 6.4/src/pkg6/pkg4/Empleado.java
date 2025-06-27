/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg4;

/**
 *
 * @author mateo
 */
public class Empleado {
    protected String nombre;
    protected String cedula;
    protected int edad;
    protected boolean casado;
    protected double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void clasificacion(int edad){
        if(edad<=21){
            System.out.println("Principiante");
        }
        else if(edad>=22 && edad<=35){
            System.out.println("Intermedio");
        }
        else{
            System.out.println("Senior");
        }
        
    }
    public double aumentarSalario(double porcentaje){
        return salario+=salario*(porcentaje/100);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + ", casado=" + casado + ", salario=" + salario + '}';
    }
    
    
    
}
