/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg4;

/**
 *
 * @author mateo
 */
public class Programador extends Empleado {
    protected int lineasDeCodigoPorHora;
    protected String lenguajeDominante;
    public Programador(){}
    public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, cedula, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }
    public String toString(){
       return super.toString()+"El lenguaje dominante es: "+lenguajeDominante +
                "\nLineas de codigo: "+lineasDeCodigoPorHora;
    }


    
    
}
