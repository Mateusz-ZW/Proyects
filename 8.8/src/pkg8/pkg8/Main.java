/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg8;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Gerente g = new Gerente();

        String dni= Util.leerLinea("DNI:");

        while (!dni.equals("0"))
        {
            String nombre= Util.leerLinea("Nombre:");
            String apellidos= Util.leerLinea("Apellidos:");
            String telefono= Util.leerLinea("Teléfono:");
            String direccion= Util.leerLinea("Dirección:");

            g.añadir(new Cliente(dni,nombre,apellidos,telefono, direccion));
            
            g.mostrar(dni);
                        
            dni= Util.leerLinea("Siguiente cliente:\nDNI:");


        }

        String[] opciones={"Mostrar todos los clietnes",
                           "Mostrar cliente por DNI",
                           "Borrar cliente por DNI",
                           "Salir"};

        int opcion = Util.menu(opciones);

        while (opcion!=4)
        {
            switch(opcion)
            {
                case 1: g.mostrar(); break;
                case 2: dni =Util.leerLinea("DNI:");
                        g.mostrar(dni);
                        break;
                case 3: dni =Util.leerLinea("DNI:");
                        
                        if(!g.borrar(dni))
                            System.out.println("No existe ese cliente");
                        else   
                            System.out.println("Cliente borrado");
                        break;

            }
            opcion=Util.menu(opciones);

        }
    }
    
}
