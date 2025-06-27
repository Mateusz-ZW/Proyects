/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajeria;

/**
 *
 * @author mateo
 */
public class MensajesSinE extends Mensaje{
    public MensajesSinE(int codigo,String mensaje) {
        super(codigo, mensaje);
       
    }

    @Override
    public void setMensaje(String mensaje) {
        mensaje=mensaje;
    }
    
}
