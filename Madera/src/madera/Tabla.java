/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package madera;

/**
 *
 * @author mateo
 */
public class Tabla {
    //atributos
    private double codigo;
    private String tipo;
    private int anchura;
    private int longitud;
    private boolean dividida;
    private String color;
    private long espesor;
    private long existencia;

    //constructores
    public Tabla () 
    {

    }
    public Tabla(double codigo, int anchura, int longitud, long espesor, long existencia) {
        this.codigo=codigo;
        this.anchura=anchura;
        this.longitud=longitud;
        this.espesor=espesor;
        this.existencia=existencia;
    }
    public Tabla(String tipo,String color) {
        this.tipo=tipo;
        this.color=color;
    }
    //metodos, definen que podemos hacer con los objetos
    public void setColor(String color) {
        this.color=color;
    }
    public String getColor() {
        return color;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }
    
}
