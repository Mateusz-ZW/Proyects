/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Semana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        diaSemana diaLunes = null;
        diaSemana diaMartes = null;
        diaSemana diaMiercoles = null;
        diaSemana diaJueves = null;
        diaSemana diaViernes = null;
        diaSemana diaSabado = null;
        diaSemana diaDomingo = null;
        double cantidad=0;
        String nombre="";
        int coeficiente=0;
        double resultado=0;
         diaSemana diaBuscado = null;
        while (true) {
            System.out.println("Menu:");
            System.out.println("A - Crear día de la semana");
            System.out.println("B - Consultar día de la semana");
            System.out.println("Escribe 'fin' para terminar");
            String opcion = scanner.nextLine();

            switch (opcion.toLowerCase()) {
                case "a": // Crear día de la semana
                    System.out.print("Introduce el nombre del día: ");
                     nombre = scanner.nextLine();

                    // Comprobar si el día ya existe
                    if (nombre.equalsIgnoreCase("Lunes") && diaLunes != null) {
                        System.out.println("Error: El día Lunes ya existe.");
                        continue;
                    } else if (nombre.equalsIgnoreCase("Martes") && diaMartes != null) {
                        System.out.println("Error: El día Martes ya existe.");
                        continue;
                    } else if (nombre.equalsIgnoreCase("Miércoles") && diaMiercoles != null) {
                        System.out.println("Error: El día Miércoles ya existe.");
                        continue;
                    } else if (nombre.equalsIgnoreCase("Jueves") && diaJueves != null) {
                        System.out.println("Error: El día Jueves ya existe.");
                        continue;
                    } else if (nombre.equalsIgnoreCase("Viernes") && diaViernes != null) {
                        System.out.println("Error: El día Viernes ya existe.");
                        continue;
                    } else if (nombre.equalsIgnoreCase("Sábado") && diaSabado != null) {
                        System.out.println("Error: El día Sábado ya existe.");
                        continue;
                    } else if (nombre.equalsIgnoreCase("Domingo") && diaDomingo != null) {
                        System.out.println("Error: El día Domingo ya existe.");
                        continue;
                    }

                    System.out.print("Introduce la tarifa: ");
                    int tarifa = scanner.nextInt();
                    System.out.print("Introduce la cantidad: ");
                    cantidad = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer del scanner

                    // Crear el objeto DiaSemana
                    switch (nombre.toLowerCase()) {
                        case "lunes":
                            diaLunes = new diaSemana(nombre, tarifa, cantidad);
                            break;
                        case "martes":
                            diaMartes = new diaSemana(nombre, tarifa, cantidad);
                            break;
                        case "miércoles":
                            diaMiercoles = new diaSemana(nombre, tarifa, cantidad);
                            break;
                        case "jueves":
                            diaJueves = new diaSemana(nombre, tarifa, cantidad);
                            break;
                        case "viernes":
                            diaViernes = new diaSemana(nombre, tarifa, cantidad);
                            break;
                        case "sábado":
                            diaSabado = new diaSemana(nombre, tarifa, cantidad);
                            break;
                        case "domingo":
                            diaDomingo = new diaSemana(nombre, tarifa, cantidad);
                            break;
                        default:
                            System.out.println("Día no válido. Intenta de nuevo.");
                            break;
                    }
                    System.out.println("Día creado: " + nombre);
                    break;

                case "b": // Consultar día de la semana
                    System.out.println("Introduce el nombre del día a consultar: ");
                    nombre = scanner.next();

                    System.out.print("Introduce un coeficiente (entre 2 y 5): ");
                    coeficiente = scanner.nextInt();
                    
                    if (coeficiente >= 2 || coeficiente <= 5) {
                        System.out.println("El coeficiente es "+coeficiente);
                        
                    }
                    else {
                        System.out.println("Coeficiente incorrecto");
                      break;
                             
                    }
                    
                       case "fin": // Terminar el programa
                    System.out.println("Fin del programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
                   
            
                    // Buscar el día correspondiente
                    switch (nombre.toLowerCase()) {
                        case "lunes":
                            diaBuscado = diaLunes;
                            break;
                        case "martes":
                            diaBuscado = diaMartes;
                            break;
                        case "miércoles":
                            diaBuscado = diaMiercoles;
                            break;
                        case "jueves":
                            diaBuscado = diaJueves;
                            break;
                        case "viernes":
                            diaBuscado = diaViernes;
                            break;
                        case "sábado":
                            diaBuscado = diaSabado;
                            break;
                        case "domingo":
                            diaBuscado = diaDomingo;
                            break;
                        default:
                            System.out.println("Día no registrado aún.");
                            continue;
                    }

                    if (diaBuscado == null) {
                        System.out.println("Día no registrado aún.");
                    } else {
                       
                        System.out.println("Nombre: " + diaBuscado.getNombre());
                        System.out.println("Tarifa: " + diaBuscado.getTarifa());
                        System.out.println("Cantidad: " + diaBuscado.getCantidad());
                        System.out.println("Resultado: " + resultado);
                    }
                    

             
        }
    }
   public static double calcularResultado(double coeficiente, double cantidad) {
        return cantidad * coeficiente; // Multiplica la cantidad por el coeficiente
    }
}
    
    

