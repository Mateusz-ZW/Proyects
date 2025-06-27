/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendavideojuegos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mateo
 */
public class Videojuego implements Serializable{
    private ArrayList<Videojuego> v=new ArrayList();
    private String titulo;
    private String categoria;
    private boolean multijugador;
    private boolean nuevo;
  

    public Videojuego(String titulo, String categoria, boolean multijugador,boolean nuevo) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.multijugador = multijugador;
        this.nuevo=nuevo;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isMultijugador() {
        return multijugador;
    }

    public void setMultijugador(boolean multijugador) {
        this.multijugador = multijugador;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }
    
    public void añadirVideojuego(){
      v.add(new Videojuego(titulo, categoria, multijugador, nuevo));
    }
    public void borrarVideojuego(){
         Iterator<Videojuego> iterator = v.iterator();
        while (iterator.hasNext()) {
            Videojuego v = iterator.next();
            if (v.getTitulo().equals(titulo)) {
                iterator.remove();
    }
        }
    }
        
    public String toString(){
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", multijugador=" + multijugador +
                ", nuevo=" + nuevo +
                '}';
    }
}

