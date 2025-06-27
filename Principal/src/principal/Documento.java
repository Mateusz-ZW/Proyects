/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.io.*;

/**
 *
 * @author mateo
 */
public class Documento {
    public static int leer(String n, boolean mostrar)
	{
		boolean leido = false;
		File f = new File (n);
		int lineas = 0;
		if (f.exists())
		{
			BufferedReader br = null;
			try
			{
				br = new BufferedReader(new FileReader(f));
				String linea = br.readLine();
				while (linea!=null)
				{
					lineas++;
					if (mostrar)
						System.out.println(linea);
					linea = br.readLine();
				}
				leido = true;
			}
			catch (IOException e)
			{
				System.out.println("Error leyendo el fichero");
			}
			finally
			{
				try
				{
					if (br!=null)
						br.close();
				}
				catch (IOException e)
				{
					System.out.println("Error cerrando el fichero");
				}
			}
			
		}
		return (leido)?lineas:-1;
	}
	
	public static void crear(String n)
	{
		File f = new File(n);
		boolean seguir = true;
		if (f.exists())
		{
			seguir = Lector.leerSiNo("El fichero ya existe, ¿desea sobreescribirlo?");			
		}
		if (seguir)
		{
			System.out.println("Escriba las líneas del documento. Terminar con \"FIN\"");
			String linea = Lector.leerLinea(null);
			
			BufferedWriter bw = null;
			try
			{
				bw = new BufferedWriter(new FileWriter(f));
				while (!linea.equalsIgnoreCase("FIN"))
				{
					bw.write(linea);
					bw.newLine();
					linea = Lector.leerLinea(null);
				}
			}
			catch (IOException e)
			{
				System.out.println("Error escribiendo el archivo");
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
					System.out.println("Error cerrando el fichero");
				}
			}
			
		}
		
	}

}
