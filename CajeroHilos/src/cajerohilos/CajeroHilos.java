/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajerohilos;

/**
 *
 * @author mateo
 */
public class CajeroHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c=new Cuenta(40);
        SacarDinero h1=new SacarDinero("Ana",c);
        SacarDinero h2=new SacarDinero("Juan",c);
        h1.start();
        h2.start();
    }
    
}
