/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg2.pkg2;

/**
 *
 * @author mateo
 */
public class PCAgua extends PCongelado{
    protected int salinidad;
    public int getSalinidad(){
        return salinidad;
    }
    public void setSalinidad(int salinidad){
        this.salinidad=salinidad;
    }
    
    public void mostrar(){
        System.out.println("Producto congelado por agua: ");
        super.mostrar();
        System.out.println("Salinidad: "+salinidad);
    }
}
