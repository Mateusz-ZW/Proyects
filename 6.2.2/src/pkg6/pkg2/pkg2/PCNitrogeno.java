/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg2.pkg2;

/**
 *
 * @author mateo
 */
public class PCNitrogeno extends PCongelado{
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
    
    public void mostrar()
    {
        System.out.println("Producto congelado por nitrógeno");
        super.mostrar();
        System.out.println("Método: "+metodo+
                           "\nTiempo: "+tiempo);
    }
}
