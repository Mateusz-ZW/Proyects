/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg8.pkg1;

/**
 *
 * @author mateo
 */
public class Revista extends Biblioteca {
    private int numero;
    public Revista(String codigo, String titulo, int año, int numero) {
        super(codigo, titulo, año);
        this.numero=numero;
    }

    @Override
    public String toString() {
        return  super.toString()+"numero=" + numero + '}';
    }
    
    
}
