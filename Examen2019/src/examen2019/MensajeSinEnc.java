/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2019;

/**
 *
 * @author mateo
 */
public class MensajeSinEnc extends Mensaje{
    
    public MensajeSinEnc(int codigo, String mensaje) {
        super(codigo, mensaje);
    }

    @Override
    public void setMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    
    
}
