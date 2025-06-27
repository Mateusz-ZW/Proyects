/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenvehiculo;

/**
 *
 * @author mateo
 */
public class Matricula {
    private String mat;
	
	public Matricula(String m)
	{
		this.mat = m;
	}
	
	private static boolean esLetraMayuscula(char c)
	{
		return Character.isLetter(c)&&!Character.isLowerCase(c);
		
	}
	
	public static boolean comprobar(String m)
	{
		if (m.length()!=7)
			return false;
		for (int i = 0; i < 4; i++)
		{
			if (!(Character.isDigit(m.charAt(i))))
				return false;
		}
		for (int i = 4; i < 7; i++)
		{
			if (!esLetraMayuscula(m.charAt(i)))
				return false;
		}
		return true;
		
	}
	
	public boolean equals(Matricula m)
	{
		return mat.equals(m.mat);
	}
        public String toString()
	{
		return mat.substring(0, 4)+"-"+mat.substring(4);
	}
}

