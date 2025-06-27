/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2019;

/**
 *
 * @author mateo
 */
public class MensajeEnc extends Mensaje implements IEncriptable{
    
    public MensajeEnc(int c,String m){
        codigo=codigo;
        mensaje=encriptar(mensaje);
    }

    @Override
    public void setMensaje(String m) {
        mensaje=m;
    }
   

    @Override
    public String encriptar(String texto) {
        char [] men=texto.toCharArray();
        for(int i=0;i<men.length;i++){
            men[i]=(char)(men[i]+1);
        }
        return String.copyValueOf(men);
    }

    @Override
    public String desencriptar() {
       char [] men = mensaje.toCharArray();
	for (int i = 0; i < men.length; i++)
		men[i] = (char) (men[i]-1);
	return String.copyValueOf(men);
    }
    public static String toDesencriptado(){
        return codigo+" "+desencriptar();
    }
    
}
