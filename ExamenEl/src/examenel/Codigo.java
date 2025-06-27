/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenel;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public class Codigo implements Serializable{
    protected String cod;
    
    public Codigo(String cod){
        this.cod=cod;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    public static boolean esValido(String cod){
        if(cod.length()!=8)return false;
        for(int i=0;i<cod.length();i++){
            //Para que vaya de caracter a caracter
            char l=cod.charAt(i);
            if((l<'A' || l>'Z') && (l<'0' || l>'9')){
                return false;
            }
        }
        return true;
    }
    public String toString(){
        return cod;
    }
}
