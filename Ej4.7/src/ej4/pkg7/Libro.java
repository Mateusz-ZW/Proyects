/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4.pkg7;

/**
 *
 * @author mateo
 */
public class Libro {
     private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    private int ntotal;
    private int nPrestados;
   private static int totalLibros = 0;
    private static int totalPrestados = 0;
    public Libro(){
        
    }
     public Libro(String titulo, String autor,int ejemplares,int prestados){
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
        this.prestados=prestados;
        ntotal += ejemplares;
        nPrestados+= prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        ntotal+=(ejemplares-this.ejemplares);
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        nPrestados+=(prestados-this.prestados);
        this.prestados = prestados;
    }

    public int getNtotal() {
        return ntotal;
    }

    public void setNtotal(int ntotal) {
        this.ntotal = ntotal;
    }

    public int getnPrestados() {
        return nPrestados;
    }

    public void setnPrestados(int nPrestados) {
        this.nPrestados = nPrestados;
    
    }
     public boolean prestamo(){
         
         if(prestados<ejemplares){
             prestados++;
             nPrestados++;
         
         return true;
         }
         else
             return false;
         
     }
     public boolean devolucion(){
         if(prestados>0){
             prestados--;
             nPrestados--;
             return true;
         }
         else 
             return false;
         
     }
     public void mostrarLibro(){
         System.out.println("El titulo es: "+this.titulo+"de autor: "+this.autor+"hay "+this.ejemplares+"ejemplares"+"De los cuales se han prestado: "+this.prestados);
         System.out.println("Porcentaje del total del libros: "+(ejemplares*100/ntotal)+"%");
        System.out.println("Porcentaje del total de prestados: "+(prestados*100/nPrestados)+"%");
     }
    
}
