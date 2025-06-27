/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public abstract class Trabajo implements Serializable {
    protected String codigo;
    protected static int contador=0;
    protected String desc;
    protected int horas=0;
    protected boolean finalizado=false;
    protected final double PRECIO_HORA=30;
    
    public String generarID(){
        String val=""+contador;
        
        while(val.length()<7){
            val="0"+val;
            contador++;
        }
        return "T"+val;
    }
    public Trabajo(String d){
        desc=d;
        codigo=generarID();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Trabajo.contador = contador;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void finalizar(){
        finalizado=true;
    }
    
    public void incrementarHoras(int hor){
        if(!finalizado){
            horas+=hor;
        }
        else{
            System.out.println("No puedo incrementar las horas de un trabajo finalizado");
        }
    }
    public abstract double calcularPrecio();
        
    
}
