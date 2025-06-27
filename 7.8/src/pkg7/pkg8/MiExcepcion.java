/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg8;

/**
 *
 * @author mateo
 */
public class MiExcepcion extends Exception {
    private String m;
    public MiExcepcion(String m){
        this.m=m;
    }
    public void mostrar(){
        System.out.println(m);
    }
}
