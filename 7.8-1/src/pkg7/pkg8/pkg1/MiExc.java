/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg8.pkg1;

/**
 *
 * @author mateo
 */
public class MiExc extends Exception{
    private String cad;
    public MiExc(String cad){
        this.cad=cad;
    }
    public void mostrar(){
        System.out.println("La cadena es: "+cad);
    }
}
