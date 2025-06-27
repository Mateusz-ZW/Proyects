/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendavideojuegos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class TiendaVideojuegos {

    /**
     * @param args the command line arguments
     */
  


     final static double NUEVO=0.1;
    final static double SEMI=0.05;
    public static ArrayList<Videojuego>v=new ArrayList<Videojuego>();
       public static int menu()
    {
        int op = 0;
        while (op<1 || op > 5)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("1. Registrar videojuego");
            System.out.println("2. Borrar Videojuego");
            System.out.println("3. Mostrar informacion");
            System.out.println("4. Salir");
            op = sc.nextInt();
        }
        return op;
    }
     
    public static void registrarVideojuego()
    {
        ArrayList<Videojuego>v=new ArrayList();
    Scanner sc=new Scanner(System.in);
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Categoria: ");
        String categoria = sc.nextLine();
        
        System.out.print("¿Tiene multijugador? (si/no): ");
        boolean multijugador = sc.nextLine().equalsIgnoreCase("si");

        System.out.print("¿Es nuevo? (si/no): ");
        boolean nuevo = sc.nextLine().equalsIgnoreCase("si");
    
        
       double precio = nuevo ? 20 : 15;
        if (!nuevo) {
            double descuento = Precio(precio);
            precio = precio * descuento;
        }
         System.out.println("El precio es: " + precio + " euros");
         
         
        Videojuego v1 = new Videojuego(titulo, categoria, multijugador, nuevo);
        v.add(v1);
        System.out.println("Videojuego registrado: " + v1);
        
    }
    public static boolean borrarVideojuego(){
        Scanner sc=new Scanner(System.in);
      System.out.print("Dime el nombre del videojuego: ");
        String titulo = sc.nextLine();
        Videojuego videojuego = buscar(titulo);
        if (videojuego != null) {
            v.remove(videojuego);
            System.out.println("Videojuego '" + titulo + "' borrado.");
            return true;
        } else {
            System.out.println("Videojuego no encontrado.");
            return false;
        }
    }
  
    public static Videojuego buscar(String titulo)
    {
       for (Videojuego videojuego : v) {
            if (videojuego.getTitulo().equalsIgnoreCase(titulo)) {
                return videojuego;
            }
        }
        return null;
    }
   
     public static double Precio(double precio)
     {
       return precio * (precio == 20 ? NUEVO : SEMI);
     }
    public static void mostrarInf()
    {
         for (Videojuego videojuego : v) {
            System.out.println(videojuego);
        }
    }
       
    
 
    public static void guardarDatos()
    {
        
        ObjectOutputStream oos = null;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream("videojuego.bin"));
            oos.writeObject(v);
        }
        catch (IOException e)
        {
            System.out.println("Error guardando los datos");
        }
        finally
        {
            try
            {
                if (oos!=null)
                    oos.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero");
            }
        
        }
    }
    public static void recuperarDatos(){
         ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream("videojuego.bin"));
            v = (ArrayList<Videojuego>) ois.readObject();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error en los datos del fichero");
        }
        catch (FileNotFoundException e){}
        catch (IOException e)
        {
            System.out.println("Error leyendo el fichero");
        }
        catch (Exception e)
        {
            System.out.println("Error en los datos");
        }
        finally
        {
            try
            {
                if (ois!=null)
                    ois.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero");
            }
        }
    }
   public static boolean esTelefonoValido(String telefono) {
        // Aquí puedes ajustar la validación según tus necesidades
        return telefono.matches("\\d{9,15}");
   }
    public static void main(String[] args) {
        Videojuego v1;
        Scanner sc=new Scanner(System.in);
        Cliente c=new Cliente();
       
        System.out.println("Dime el nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Dime tu apellido: ");
        String apellido=sc.nextLine();
        try{
        System.out.println("Dime tu telefono: ");
        String telefono=sc.nextLine();
         while (!esTelefonoValido(telefono)) {
            System.out.print("Número de teléfono inválido. Inténtalo de nuevo: ");
            telefono = sc.nextLine();
        }
        Telefono t = new Telefono(telefono);
        }catch(TelefonoException e){
            System.out.println("Telefono no valido");
        }
        System.out.println("Dime tu edad: ");
        int edad=sc.nextInt();
        
        
         System.out.println("Bienvenido " +nombre+apellido+" a mi tienda de videojuegos."+
              "El programa simula una tienda que vende juegos."+
              " Puedes registrar videojuegos,"+
              " borrar videojuegos "+
              "y mostrar informacion."+
                 "Los juegos nuevos cuestan 20 euros y los seminuevos tienen un descuento incluido en la compra, asi que elige cuanto pagas.");
             
    
    boolean continuar = true;
   
    
    //Se instancian y cargan los productos
    ArrayList<Videojuego> v=new ArrayList();
        recuperarDatos();
        
        int op = menu();
        while (op!=4)
        {
            switch (op)
            {
                case 1: registrarVideojuego(); break;
                case 2: borrarVideojuego(); break;
                case 3: mostrarInf(); break;
                
            }
            op = menu();
        }
        guardarDatos();
        
    }
}
    
    
    
    
