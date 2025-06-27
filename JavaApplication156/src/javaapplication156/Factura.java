/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication156;



/**
 *
 * @author mateo
 */
public class Factura extends Precio {
    
    private String emisor;
    private String cliente;
    
    public Factura(){
        super();
    }
    public Factura(double precio,String emisor,String cliente){
        super(precio);
        this.cliente=cliente;
        this.emisor=emisor;
    }
    public void imprimirFactura(){
        System.out.println("La factura es para el cliente: "+this.cliente+" del emisor: "+ this.emisor+super.toString());
    }
}
