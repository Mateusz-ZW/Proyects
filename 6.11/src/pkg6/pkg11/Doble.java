/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg11;

/**
 *
 * @author mateo
 */
public class Doble implements Operable<Double>{

    @Override
    public Double suma(Double op, Double op2) {
        return op+op2;
    }

    @Override
    public Double resta(Double op, Double op2) {
        return op-op2;
    }   

    @Override
    public Double mult(Double op, Double op2) {
       return op*op2; 
    }   

    @Override
    public Double div(Double op, Double op2) {
        return op/op2;
    }   
    
}
