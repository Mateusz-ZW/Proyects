/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public class Referencia implements Serializable{
    private String Referencia;

    public Referencia(String Referencia) {
        this.Referencia = Referencia;
    }
    public static boolean esValido(String ref){
        if(ref.length()!=8){
          return false;  
        }
        if(ref.charAt(0)=='-'){
            return false;
        }
        try{
            Integer.parseInt(ref);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public String getNumero()
	{
		return Referencia;
	}
	
	public boolean equals(String ref)
	{
		return Referencia==ref;
	}
    public String toString(){
        return Referencia.substring(0,2)+"-"+Referencia.substring(2,5)+
                                    "-"+Referencia.substring(5);
    }
}
