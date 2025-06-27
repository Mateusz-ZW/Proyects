/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaropa;


import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class TiendaRopa {

   public static String fichero = "articulos.bin";
   public static ArrayList<Articulos> articulos = new ArrayList<Articulos>();
   
    public static void leerArchivo()
	{
		File f = new File(fichero);
		
		if (f.exists())
		{
			ObjectInputStream ois = null;
			try
			{
				ois = new ObjectInputStream(new FileInputStream(f));
				articulos = (ArrayList<Articulos>)ois.readObject();
			}
			catch (ClassNotFoundException e)
			{
				System.out.println("Error en los datos del fichero");
			}
			catch (IOException e)
			{
				System.out.println("Error abriendo el fichero");
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
	}
	
	public static void guardarArchivo()
	{
		ObjectOutputStream oos = null;
		try
		{
			oos = new ObjectOutputStream(new FileOutputStream(fichero));
			oos.writeObject(articulos);
		}
		catch (IOException e)
		{
			System.out.println("Error abriendo el fichero o guardando los datos");
		}
		finally
		{
			try
			{
				if (oos!=null)
				{
					oos.close();
				}
			}
			catch (IOException e)
			{
				System.out.println("Error cerrando el fichero");
			}
		}
	}
	
	public static int menu()
	{

		int op = 0;
		Scanner sc = new Scanner(System.in);
		while (op < 1 || op > 4)
		{
			System.out.println("1. Añadir");
			System.out.println("2. Comprar");
			System.out.println("3. Devolver");
			System.out.println("4. Salir");
			try
			{
				op = sc.nextInt();
				if (op < 1 || op > 4)
					System.out.println("Opción no válida");
			}
			catch (Exception e)
			{
				sc.nextLine();
				System.out.println("Opción no válida");
			}
		}
		return op;
	}
	
	public static int menuAnadir()
	{

		int op = 0;
		Scanner sc = new Scanner(System.in);
		while (op < 1 || op > 3)
		{
			System.out.println("1. Accesorio");
			System.out.println("2. Artículo de ropa sin devolución");
			System.out.println("3. Artículo de ropa con devolución");
			try
			{
				op = sc.nextInt();
				if (op < 1 || op > 3)
					System.out.println("Opción no válida");
			}
			catch (Exception e)
			{
				sc.nextLine();
				System.out.println("Opción no válida");
			}
		}
		return op;
		
	}
        public static void anadir()
	{
		Scanner sc = new Scanner(System.in);
		int op = menuAnadir();
		System.out.println("Indica la referencia");
		String ref = sc.nextLine();
		while (!Referencia.esValido(ref))
		{
			System.out.println("Referencia no válida, ha de tener 8 dígitos");
			System.out.println("Indica la referencia");
			ref = sc.nextLine();
		}
		Referencia r = new Referencia(ref);
		System.out.println("Indica la descripción");
		String desc = sc.nextLine();
		System.out.println("Indica la cantidad");
		int cant = sc.nextInt();
		System.out.println("Indica el precio");
		double precio = sc.nextDouble();

		if (op == 1)
			articulos.add(new Accesorios(r, desc, cant, precio));
		else
		{
			System.out.println("Indica la talla");
			String talla = sc.nextLine();
			while (!Prendas.tallaValida(talla))
			{
				System.out.println("Talla no válida. Indica la talla");
				talla = sc.nextLine();
			}
			if (op == 2)
				articulos.add(new Prendas(r, desc, cant, precio,talla));
			else
				articulos.add(new PrendasConDevolucion(r, desc, cant, precio,talla));
		}
	}
	
	public static Articulos buscar(String r)
	{
		Iterator<Articulos> it = articulos.iterator();
		while (it.hasNext())
		{
			Articulos a = it.next();
			if (a.equals(r))
				return a;
		}
		return null;
	}
	
	public static void listar()
	{
		Iterator<Articulos> it = articulos.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
        
        public static void comprar()
	{
		Scanner sc = new Scanner(System.in);
		listar();
		System.out.println("Indica la referencia");
		String ref = sc.nextLine();
		while (!Referencia.esValido(ref))
		{
			System.out.println("Referencia no válida, ha de tener 8 dígitos");
			System.out.println("Indica la referencia");
			ref = sc.nextLine();
		}
		Articulos a = buscar(ref);
		if (a==null)
			System.out.println("Artículo no encontrado");
		else
		{
			System.out.println("Indica la cantidad");
			int cant = sc.nextInt();
			if (cant <=a.getCantidad())
			{
				a.setCantidad(a.getCantidad()-cant);
				System.out.println("Importe de la venta: "+
							a.getPrecio()*cant);
			}
			else
				System.out.println("No hay disponibilidad del artículo");
		}
	}
	
	public static void devolver()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Indica la referencia");
		String ref = sc.nextLine();
		while (!Referencia.esValido(ref))
		{
			System.out.println("Referencia no válida, ha de tener 8 dígitos");
			System.out.println("Indica la referencia");
			ref = sc.nextLine();
		}
		Articulos a = buscar(ref);
		if (a==null)
			System.out.println("Artículo no encontrado");
		else
		{
			if (a instanceof Accesorios || a instanceof PrendasConDevolucion)
			{
				System.out.println("Indica el número de días");
				int dias = sc.nextInt();
				double dev;
				if (a instanceof Accesorios)
					dev = ((Accesorios)a).devolver(dias);
				else
					dev = ((PrendasConDevolucion)a).devolver(dias);
				if (dev ==-1)
				{
					System.out.println("Superado el plazo");
				}
				else
				{
					System.out.println("Importe de devolución: "+dev);
				}
			}
			else
				System.out.println("No se puede devolver");
		}
	}
    public static void main(String[] args) {
        leerArchivo();
		int op = 0;
		while (op!= 4)
		{
			op = menu();
			switch (op)
			{
			case 1: anadir();break;
			case 2: comprar(); break;
			case 3: devolver();break;
			}
		}
		
		guardarArchivo();

    }
    
}
