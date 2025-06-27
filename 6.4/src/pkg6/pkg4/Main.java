/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg4;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Pérez", "12345678", 30, true, 1500.00);
        empleado1.toString();
        System.out.println();

        // Aumentar salario
        empleado1.aumentarSalario(10);
        System.out.println("Salario después del aumento:");
        empleado1.toString();
        System.out.println();

        // Crear un programador
        Programador programador1 = new Programador("Ana Gómez", "87654321", 25, false, 2000.00, 50, "Java");
        programador1.toString();
    
}
}
