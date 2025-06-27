/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase;

/**
 *
 * @author mateo
 */
public class Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p=new Persona("Mateo",20);
        Empleado e=new Empleado("Mateo",20,2000);
        p.cargar();
        System.out.println(p.toString());
        e.cargar();
        System.out.println( e.toString());
}
}
