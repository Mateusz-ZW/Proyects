/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajeria;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public abstract class Mensaje implements Serializable{
    protected int codigo;
    protected String mensaje;

    public Mensaje() {
    }
    
    public Mensaje(int codigo, String mensaje) {
        this.codigo = codigo;
        this.mensaje = mensaje;
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
        return "codigo=" + codigo + " mensaje=" + mensaje;
    }
    
    
}
