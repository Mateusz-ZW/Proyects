/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutar;

/**
 *
 * @author mateo
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contador c=new Contador(100);
        HiloA a=new HiloA("HiloA",c);
        HiloB b=new HiloB("HiloB",c);
        a.start();
        b.start();
    }
    
}
