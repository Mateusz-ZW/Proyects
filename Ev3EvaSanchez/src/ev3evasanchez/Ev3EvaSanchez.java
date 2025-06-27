/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ev3evasanchez;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ev3EvaSanchez {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Usuario> lista = new ArrayList<>();
    public static Usuario user = null;
    public static String bin = "usuarios.bin";

    public static void primeraVez() {
        leerBin();
        if (lista.isEmpty()) {

            System.out.println("Iniciando sesion por primera vez...\nVamos a crear una cuenta de administrador:");
            System.out.println("DNI");
            String dni = sc.nextLine();
            System.out.println("Nombre");
            String nad = sc.nextLine();
            System.out.println("Apellidos");
            String adap = sc.nextLine();
            System.out.println("Contraseña");
            String cont = sc.nextLine();
            Admin admin = new Admin(dni, nad, adap, cont);
            lista.add(admin);
            System.out.println("Administrador creado con exito");
            user = admin;
            menuAdmin();
        } else {

            adminCreado();
        }

    }

    public static void adminCreado() {
        leerBin();

    }

    public static void leerBin() {
        File f = new File(bin);
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(f));
            lista = (ArrayList<Usuario>) ois.readObject();
            System.out.println("Introduce DNI");
            String dn = sc.nextLine();
            System.out.println("Introduce contraseña");
            String pasw = sc.nextLine();
            boolean valido = false;

            for (Usuario i : lista) {
                if (i.getDni().equalsIgnoreCase(dn) && i.getPsw().equals(pasw)) {
                    valido = true;
                    if (i instanceof Admin) {

                        menuAdmin();
                    } else if (i instanceof Poeta) {

                        menuP();
                    }
                }
            }
            if (!valido) {
                System.out.println("Datos erroneos");
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Binario no encontrado");
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el binario");
            }
        }

    }

    public static void crearBin() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(bin));
            oos.writeObject(lista);
            System.out.println("Fichero binario creado");
        } catch (IOException e) {
            System.out.println("Error al crear el binario");
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el binario");
            }
        }

    }

    public static void menuAdmin() {
        String op;
        boolean salir = false;
        do {
            System.out.println("Introduce numero para cada opcion:\n1.Crear usuario\n2.Listar usuarios"
                    + "\n3.Crear usuarios automaticamente\n4.Borrar rango de usuarios\n5.Cambiar de usuario\n6.Salir");
            op = sc.nextLine();
            switch (op) {
                case "1":
                    crearUser();
                    break;
                case "2":
                    listar();
                    break;
                case "3":
                    crearAuto();
                    break;
                case "4":
                    borrarR();
                    break;
                case "5":
                    cambiarU();
                    break;
                case "6":
                    crearBin();
                    salir = true;

                    break;
                default:
                    System.out.println("El rango de opciones valido es de 1 a 6.");
                    break;
            }

        } while (!salir);
    }

    public static void crearUser() {
        System.out.println("Dar de alta a un poeta:\nDNI");
        String dni = sc.nextLine();
        System.out.println("Nombre");
        String nombre = sc.nextLine();
        System.out.println("Apellidos");
        String ape = sc.nextLine();
        System.out.println("Contraseña");
        String contra = sc.nextLine();
        Poeta poet = new Poeta(dni, nombre, ape, contra);
        lista.add(poet);
        System.out.println("Usuario poeta creado");
    }

    public static void listar() {
        if (lista.isEmpty()) {
            System.out.println("No hay usuarios creados todavia");
        } else {
            for (int i = 0; i < lista.size(); i++) {

                System.out.println(lista.get(i).toString());
                System.out.println("------------");
            }
        }
    }

    public static void crearAuto() {
        Poeta p1 = new Poeta("901", "AAAA", "BBBB", "p1");
        lista.add(p1);
        Poeta p2 = new Poeta("902", "AAAA", "BBBB", "p1");
        lista.add(p2);
        Poeta p3 = new Poeta("903", "AAAA", "BBBB", "p1");
        lista.add(p3);
        Poeta p4 = new Poeta("904", "AAAA", "BBBB", "p1");
        lista.add(p4);
        Poeta p5 = new Poeta("905", "AAAA", "BBBB", "p1");
        lista.add(p5);
        Poeta p6 = new Poeta("906", "AAAA", "BBBB", "p1");
        lista.add(p6);
        System.out.println("Usuarios creados automaticamente con exito");
    }

    public static int validarInt() {
        int n = 0;
        boolean valido = false;
        while (!valido) {
            try {
                n = sc.nextInt();
                valido = true;
            } catch (Exception e) {
                System.out.println("Introduce un valor numerico...");
                sc.nextLine();
            }
        }
        return n;
    }

    public static void borrarR() {
        System.out.println("Introduce rango inicial a borrar");
        int r1 = validarInt();

        if (r1 == 0) {
            System.out.println("La posicion 0 no puede borrarse porque es la del administrador");
        } else if (r1 < 0) {
            System.out.println("No se puede borrar numeros negativos");
        } else {
            System.out.println("Introduce rango final a borrar");
            int r2 = validarInt();

            if (r2 > lista.size()) {
                System.out.println("Has introducido un valor mayor al numero de usuarios. El rango mayor es " + lista.size());
            } else {
                lista.subList(r1, r2).clear();
                System.out.println("Rango de usuarios eliminado");
            }

        }
        sc.nextLine();
    }

    public static void cambiarU() {

        System.out.println("DNI");
        String dni = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDni().equalsIgnoreCase(dni)) {
                encontrado = true;
                System.out.println("Introduce contraseña");
                String con = sc.nextLine();
                if (lista.get(i).getPsw().equals(con)) {
                    user = lista.get(i);
                    if (user instanceof Admin) {
                        menuAdmin();
                    } else if (user instanceof Poeta) {
                        menuP();
                    }
                }
            }
        }
        if (!encontrado) {
            System.out.println("DNI " + dni + " no encontrado");
        }
    }

    public static void menuP() {
        String op;
        boolean salir = false;
        do {
            System.out.println("Escoge numero para cada opcion:\n1.Entregar tarjeta\n2.Mostrar tarjeta"
                    + "\n3.Cambiar de usuario\n4.Salir");
            op = sc.nextLine();
            switch (op) {
                case "1":
                    entregar();

                    break;
                case "2":
                    System.out.println("Introduce tu dni");
                    String t = sc.nextLine();
                    String tarjeta = t + ".txt";
                    mostrart(tarjeta);
                    break;
                case "3":
                    cambiarU();
                    break;
                case "4":
                    crearBin();
                    salir = true;

                    break;
                default:
                    System.out.println("Opcion invalida, el rango de opciones es 1 a 4.");
                    break;
            }
        } while (!salir);

    }

    public static void entregar() {

        String tar = user.getDni() + ".txt";
        System.out.println("Escribe tu texto:");
        String linea = sc.nextLine();
        BufferedWriter bf = null;

        try {
            bf = new BufferedWriter(new FileWriter(tar));

            bf.write(linea);

            //LO DEL FIN NO ME SALE!!!!!!!
            System.out.println("Tarjeta guardada con nombre " + tar);

        } catch (IOException e) {
            System.out.println("Error al crear la tarjeta");
        } finally {
            try {
                if (bf != null) {
                    bf.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar la tarjeta");
            }
        }
    }

    public static void mostrart(String tx) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(tx));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer la tarjeta. Prueba con otro nombre.");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar la tarjeta");
            }
        }

    }

    public static void main(String[] args) {

        primeraVez();

    }

}
