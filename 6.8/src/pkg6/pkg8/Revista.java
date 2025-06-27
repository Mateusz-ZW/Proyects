/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg8;

/**
 *
 * @author mateo
 */
public class Revista extends Biblioteca{
    private int n;

    public Revista() {
        super();
    }

    public Revista( String codigo, String titulo, int año,int n) {
        super(codigo, titulo, año);
        this.n = n;
    }
    public String toString(){
       return super.toString()+"numero: "+n;
    }
    
}
