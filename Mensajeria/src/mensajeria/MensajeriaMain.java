/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mensajeria;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mateo
 */
public class MensajeriaMain {

    
    private static ArrayList<Mensaje> lista;
	private static String nFichero = "mensajes.dat";
	
	public static int menu()
	{
		String[] ops = {"Listar mensajes","Mostrar mensajes normales", 
				"Mostrar mensajes encriptados", "Buscar mensaje", "Añadir mensaje",
				   "Desencriptar mensaje", "Eliminar mensaje", "Salir"};
		Menu m = new Menu(ops);
		return m.mostrar();
		
	}
	
	public static int menuListar()
	{
		String[] ops = {"Listar mensajes por pantalla","Listar mensajes en fichero"};
		Menu m = new Menu(ops);
		return m.mostrar();		
	}
	
	public static int menuAnadir()
	{
		String[] ops = {"Añadir mensaje normal","Añadir mensaje encriptado"};
		Menu m = new Menu(ops);
		return m.mostrar();		
	}
	
	public static void guardarDatos()
	{
		ObjectOutputStream oos = null;
		try
		{
			oos = new ObjectOutputStream(new FileOutputStream(nFichero));
			oos.writeObject(lista);
		}
		catch (IOException e)
		{
			System.err.println("Error guardando el fichero");
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
				System.err.println("Error cerrando el fichero");
			}
		}
	}
	
	public static void leerDatos()
	{
		ObjectInputStream ois = null;
		File f = new File (nFichero);
		try
		{
			if (!f.exists())
				lista = new ArrayList<Mensaje>();
			else
			{
				lista = (ArrayList<Mensaje>)ois.readObject();
			}
		}
		catch (IOException e)
		{
			System.err.println("Error leyendo el fichero");
		} 
		catch (ClassNotFoundException e) 
		{
			System.err.println("Error en los datos del fichero");
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
				System.err.println("Error cerrando el fichero");
			}
		}
	}

	public static void listarTodos()
	{
		int op = menuListar();
		String nf = "";
		BufferedWriter bw = null;
		try
		{
			if (op==2)
			{
				System.out.println("Escribe el nombre del fichero");
				nf = Teclado.leerLinea();
				bw = new BufferedWriter(new FileWriter(nf));
			}
			Iterator <Mensaje> it = lista.iterator();
			while (it.hasNext())
			{
				Mensaje m = it.next();
				switch (op)
				{
				case 1: System.out.println(m); break;
				case 2: 
						bw.write(m.toString()+"\n");
						break;
				}
			}
		}
		catch (IOException e)
		{
			System.err.println("Error escribiendo el fichero de texto");
		}
		finally
		{
			try
			{
				if (bw!=null)
					bw.close();
			}
			catch (IOException e)
			{
				System.err.println("Error cerrando el fichero");
			}
		}
	}
	
	public static void listarNormal()
	{	
		Iterator <Mensaje> it = lista.iterator();
		while (it.hasNext())
		{
			Mensaje m = it.next();
			if (m instanceof MensajesSinE)
				System.out.println(m);
		}
	}
	
	public static void listarEnc()
	{	
		Iterator <Mensaje> it = lista.iterator();
		while (it.hasNext())
		{
			Mensaje m = it.next();
			if (m instanceof MensajesE)
				System.out.println(m);
		}
	}
	
	public static Mensaje buscar(int c)
	{
		Iterator <Mensaje> it = lista.iterator();
		while (it.hasNext())
		{
			Mensaje m = it.next();
			if (m.getCodigo()==c)
				return m;
		}
		return null;
	}
	
	public static void buscar()
	{	
		System.out.println("Escribe el código del mensaje a buscar");
		int c = Teclado.leerInt();
		Mensaje m = buscar(c);
		if (m==null)
			System.out.println("Mensaje no encontrado");
		else
			System.out.println(m);
	}
	
	public static void desencriptar()
	{	
		System.out.println("Escribe el código del mensaje a desencriptar");
		int c = Teclado.leerInt();
		Mensaje m = buscar(c);
		if (m==null)
			System.out.println("Mensaje no encontrado");
		else if (!(m instanceof MensajesE))
			System.out.println("Mensaje no encriptado");
		else
			System.out.println(((MensajesE)m).toDesencriptado());
	}
	
	public static void anadir()
	{
		int op = menuAnadir();	
		int cod = lista.size();
		System.out.println("Escribe el mensaje");
		String m = Teclado.leerLinea();
		
		switch (op)
		{
		case 1: lista.add(new MensajesSinE(cod,m)); break;
		case 2: lista.add(new MensajesE(cod, m)); break;
		}
	
	}
	
	public static void reorganizarCodigos()
	{
		Iterator<Mensaje> it= lista.iterator();
		int contador = 0;
		while (it.hasNext())
		{
			it.next().setCodigo(contador++);
		}
	}
	
	public static void eliminar()
	{	
		System.out.println("Escribe el código del mensaje a eliminar");
		int c = Teclado.leerInt();
		Mensaje m = buscar(c);
		if (m==null)
			System.out.println("Mensaje no encontrado");
		else
		{
			lista.remove(m);
			reorganizarCodigos();
		}
	}
	public static void main(String[] args) {
		
		leerDatos();
		int op = menu();
		while (op!=8)
		{
			switch (op)
			{
			case 1: listarTodos();break;
			case 2: listarNormal();break;
			case 3: listarEnc();break;
			case 4: buscar(); break;
			case 5: anadir();break;
			case 6: desencriptar(); break;
			case 7: eliminar(); break;
			}
			op = menu();
		}
		guardarDatos();

	}
}
