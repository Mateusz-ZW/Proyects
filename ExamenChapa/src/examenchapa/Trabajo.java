/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenchapa;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public abstract class Trabajo implements Serializable{
    protected String codigo;
    private static int contador=0;
    protected String desc;
    protected int horas=0;
    protected boolean finalizado=false;
    protected final double PRECIO_HORA=30;
    
    
    private String generarId(){
        String val=""+contador;
        while(val.length()<7){
            val="0"+val;
        }
        contador++;
        return "T"+val;
    }
    public Trabajo(String desc){
        this.desc=desc;
        this.codigo=generarId();
    }
    public void incrementarHoras(int h){
        if(!finalizado){
            horas+=h;
        }
        else{
            System.out.println("No pudo incrementar las horas de un trabajo finalizado");
        }
    }

    public String getCodigo() {
        return codigo;
    }
    public void finalizar(){
        finalizado=true;
    }
    public abstract double calcularPrecio();
    
     
    
}
