/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluditos1;

/**
 *
 * @author mateo
 */
public class Perro extends Animal{
       public Perro(String n, int e)
    {
        super(n,e);
    }
    
    @Override
    public String toString()
    {
        return "Perro: "+super.toString();
    }
}
