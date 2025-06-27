/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajeria;

/**
 *
 * @author mateo
 */
public class MensajesE extends Mensaje implements IEncriptable{

    public MensajesE(int codigo, String mensaje) {
       mensaje=encriptar(mensaje);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public void setMensaje(String m){
        mensaje=m;
    }
    
    @Override
    public String encriptar(String m) {
        char [] men=mensaje.toCharArray();
        for(int i=0;i<men.length;i++){
            men[i]=(char)(men[i]-1);
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
    public String toDesencriptado()
	{
		return codigo+" "+desencriptar();
	}

  
    
}
