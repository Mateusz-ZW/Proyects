/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xd1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Videojuego {
    private static double IMPUESTO=1;
    private String titulo;
    private double precio;
    private String categoria;
    
    public Videojuego(){
        
    }
    public Videojuego(String titulo,double precio, String categoria){
        this.titulo=titulo;
        this.precio=precio;
        this.categoria=categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void asignarTitulo( Scanner sc){
       
        System.out.println("El titulo del juego es: ");
        titulo=sc.nextLine();
    }
    public double calcularPrecio(double precio){
        double total=0;
        total=this.precio+IMPUESTO;
        return total;
    }
}
