/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2019;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public abstract class Mensaje implements Serializable{
    protected int codigo;
    protected String mensaje;

    public Mensaje(int c, String m) {
        this.codigo = c;
        this.mensaje = m;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public abstract void setMensaje(String mensaje);
    
    @Override
    public String toString() {
        return "Mensaje{" + "codigo=" + codigo + ", mensaje=" + mensaje + '}';
    }
    
    
    
}
