/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg6;

import java.util.Calendar;

/**
 *
 * @author mateo
 */
public class EFijo extends Empleado{
    private double sueldo;

    public EFijo() {
        super();
    }
    
    
    public EFijo(String dni, String nombre, String apellido, int año,double sueldo) {
        super(dni,nombre,apellido,año);
        this.sueldo = sueldo;
        
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    

    @Override
    public void imprimir() {
        System.out.println("El empleado"+nombre+"con apellido: "+apellido+"cont dni: "+dni+"Lleva "+año+"años con un sueldo de "+obtenerSalario());
    }

    @Override
    public double obtenerSalario() {
       Calendar cal= Calendar.getInstance(); 
        int year= cal.get(Calendar.YEAR);
        int ant = year-año;
        int porc;
        if (ant<2)
            porc = 0;
        else if (ant<=3)
            porc = 5;
        else if (ant<=7)
            porc = 10;
        else if (ant<=15)
            porc = 15;
        else
            porc = 20;
        
        return sueldo+sueldo*porc/100;
          
        
}
}
