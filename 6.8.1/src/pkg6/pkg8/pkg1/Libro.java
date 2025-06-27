/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg8.pkg1;

/**
 *
 * @author mateo
 */
public class Libro extends Biblioteca implements Prestable{
    private boolean prestado=false;
    
   

    public Libro(String codigo,String titulo,int año){
        super(codigo,titulo,año);
        
    }

    @Override
    public void prestar() {
        prestado=true;
    }

    @Override
    public void devolver() {
        prestado=false;
    }

    @Override
    public boolean prestado() {
        return prestado;
    }
     public String toString()
    {
        return super.toString()+"\nPrestado: "+((prestado)?"Si":"No");
    }
    
    
}
