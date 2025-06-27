/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionreparaciones;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public abstract class Trabajo implements Serializable {
    protected String id;
    private static int cont=0;
    protected String desc;
    protected int horas=0;
    protected boolean finalizado=false;
    protected final double PRECIO_HORA=30;
    
   
    public Trabajo(String d){
        desc=d;
        id=generarId();
    }
     public String generarId(){
        String val=""+cont;
        while(val.length()<7){
            val="0"+val;
            
        }
        cont++;
        return "T"+val;
    }
    public String getId(){
        return id;
    }
    public void finalizar(){
        finalizado=true;
    }
    public void incrementarHoras(int h){
        if(!finalizado){
            horas+=h;
            
        }
        else{
            System.out.println("No puedo incrementar las horas de un trabajo finalizado");
        }
    }
    public abstract double calcularPrecio();
    
    
}
