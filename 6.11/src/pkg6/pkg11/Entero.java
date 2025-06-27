/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg11;

/**
 *
 * @author mateo
 */
public class Entero implements Operable<Integer> {

    @Override
    public Integer suma(Integer op, Integer op2) {
        return op+op2;
    }

    @Override
    public Integer resta(Integer op, Integer op2) {
        return op-op2; 
    }

    @Override
    public Integer mult(Integer op, Integer op2) {
        return op*op2;
    }

    @Override
    public Integer div(Integer op, Integer op2) {
        return op/op2;
    }
    
}
