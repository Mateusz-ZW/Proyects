/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg8;

/**
 *
 * @author mateo
 */
public class Libro extends Biblioteca implements Prestable{
    private boolean prestado=false;

    public Libro() {
        super();
    }

    public Libro(String codigo, String titulo, int año) {
        super(codigo, titulo, año);
    }
    public void prestar(){
        prestado=true;
    }
    public void devolver(){
        prestado=false;
    }
    public boolean prestado(){
        return prestado;
    }
    public String toString(){
        return super.toString()+"prestado: "+prestado;
    }
}
