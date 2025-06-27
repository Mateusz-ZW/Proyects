/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Trabajo {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner=new Scanner(System.in);
   private static diaSemana lunes, martes, miercoles, jueves, viernes, sabado, domingo;


    public static void main(String[] args) {

        String opcion;

        do {

        System.out.println("A- Crear día semana");

        System.out.println("B- Consultar día semana");

        System.out.println("Escriba 'fin' para terminar");

        System.out.print("Elija una opción: ");

            opcion = scanner.nextLine().toLowerCase();

            switch (opcion) {

                case "a":

                    crearDiaSemana();

                    break;

                case "b":

                    consultarDiaSemana();

                    break;

                case "fin":

                    System.out.println("Programa terminado.");

                    break;

                default:

                    System.out.println("Opción no válida.");

            }

        } while (!opcion.equals("fin"));

    }

    private static void crearDiaSemana() {

        System.out.print("Introduce el nombre del día: ");

        String nombre = scanner.nextLine().toLowerCase();

        if (nombre.equals("fin")) return;


        if (diaExiste(nombre)) {

            System.out.println("Error: Este día ya existe.");

         

        }


        System.out.print("Introduce la tarifa: ");

        int tarifa = scanner.nextInt();

        System.out.print("Introduce la cantidad: ");

        double cantidad = scanner.nextDouble();


        diaSemana nuevoDia = new diaSemana(nombre, tarifa, cantidad);

        asignarDia(nuevoDia);

    }


    private static boolean diaExiste(String nombre) {

        switch (nombre) {

            case "lunes": return lunes != null;

            case "martes": return martes != null;

            case "miercoles": return miercoles != null;

            case "jueves": return jueves != null;

            case "viernes": return viernes != null;

            case "sabado": return sabado != null;

            case "domingo": return domingo != null;

            default: return false;

        }

    }


    private static void asignarDia(diaSemana dia) {

        switch (dia.getNombre()) {

            case "lunes": lunes = dia; break;

            case "martes": martes = dia; break;

            case "miercoles": miercoles = dia; break;

            case "jueves": jueves = dia; break;

            case "viernes": viernes = dia; break;

            case "sabado": sabado = dia; break;

            case "domingo": domingo = dia; break;

        }

    }


    private static void consultarDiaSemana() {

        System.out.print("Introduce el nombre del día a consultar: ");

        String nombre = scanner.nextLine().toLowerCase();

        System.out.print("Introduce el coeficiente (2-5): ");

        int coeficiente = Integer.parseInt(scanner.nextLine());


        if (coeficiente < 2 || coeficiente > 5) {

            System.out.println("Coeficiente no válido. Debe estar entre 2 y 5.");

           

        }
    }
}
    

