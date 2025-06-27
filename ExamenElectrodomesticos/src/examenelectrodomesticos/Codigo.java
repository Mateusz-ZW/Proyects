/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenelectrodomesticos;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public class Codigo implements Serializable{
    protected String codigo;

    public Codigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public static boolean esValido(String codigo){
        if(codigo.length()!=8)return false;
            for(int i=0;i<codigo.length();i++){
                char l=codigo.charAt(i);
                if(!(l>='A' && l<='Z') && !(l>='0' && l<='9' )){
                    return false;
                    
                }
                
            }
          return true;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo;
    }
    
    
    
}
