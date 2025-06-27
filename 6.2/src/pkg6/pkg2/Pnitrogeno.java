/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg2;

/**
 *
 * @author mateo
 */
public class Pnitrogeno extends Pcongelado{
    protected String metodo;
    protected int tiempo;

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public void imprimir(){
        System.out.println("Producto nitrogenado");
        super.imprimir();
        System.out.println("El metodo es: "+metodo+"El tiempo es: "+tiempo);
    }
}

