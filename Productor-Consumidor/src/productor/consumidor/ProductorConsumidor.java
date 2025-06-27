/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productor.consumidor;

/**
 *
 * @author mateo
 */
public class ProductorConsumidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cl= new Cola();
        Productor p=new Productor(cl,1);
        Consumidor c=new Consumidor(cl,1);
        p.start();
        c.start();
    }
    
}
