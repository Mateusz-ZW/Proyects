/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo4;

/**
 *
 * @author mateo
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Lanzador l=new Lanzador();
        l.lanzarSumador(1, 50,"resultado1.txt");
        l.lanzarSumador(51, 100,"resultado2.txt");
        System.out.println("OK");
    }
    
}

