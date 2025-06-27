/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg7;

/**
 *
 * @author mateo
 */
public class DividePorCero {
    private int numerador;
    private int denominador;

    public DividePorCero(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public int operar(){
        try{
        return numerador/denominador;
        }
        catch(Exception e){
            System.out.println("Error de division por 0");
            return 0;
        }
    }
}
