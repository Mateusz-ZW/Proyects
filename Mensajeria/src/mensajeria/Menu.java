/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajeria;

/**
 *
 * @author mateo
 */
public class Menu {
    private String[] opciones;
	
	public Menu(String[] op)
	{
		opciones = op;
	}
	
	public int mostrar()
	{
		for (int i = 0; i < opciones.length; i++)
		{
			System.out.println((i+1)+". "+opciones[i]);
		}
		return Teclado.leerInt(1, opciones.length);
	}

}

