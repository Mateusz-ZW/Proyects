/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg1;

/**
 *
 * @author mateo
 */
public class Main {

   
    public static void main(String[] args) {
       Persona p=new Persona();
       
       p.cargar();
       p.imprimir();
       Empleado e=new Empleado();
       e.cargarSueldo();
       e.imprimirSueldo();
    }
    
}
