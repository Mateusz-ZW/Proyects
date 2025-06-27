/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajeria;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Teclado {
    public static int leerInt()
	{
		Scanner sc = new Scanner (System.in);
		boolean leido = false;
		int n=0;
		while (!leido)
		{
			try
			{
				n = sc.nextInt();
				leido = true;
			}
			catch (Exception e)
			{
				System.err.println("Número no válido");
				sc.nextLine();
			}
		}
		return n;
	}
	
	public static int leerInt(int a, int b)
	{
		Scanner sc = new Scanner (System.in);
		boolean leido = false;
		int n=0;
		while (!leido)
		{
			try
			{
				n = sc.nextInt();
				if (n<a || n >b) throw new Exception();
				leido = true;
			}
			catch (Exception e)
			{
				System.err.println("Número no válido");
				sc.nextLine();
			}
		}
		return n;
	}
	
	public static String leerLinea()
	{
		Scanner sc = new Scanner (System.in);
		return sc.nextLine();
	}

}


