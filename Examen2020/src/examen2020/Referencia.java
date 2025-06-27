/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2020;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public class Referencia implements Serializable{
    protected String ref;

    public Referencia(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        System.out.println(ref.substring(0,2)+"-"+ref.substring(3,6)+"-"+ref.substring(8));
    }
    public static boolean isValido(String ref){
        if(ref.length()!=8)return false;
        if(ref.charAt(0)=='-')return false;
        try{
            Integer.parseInt(ref);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public boolean equals(String r){
        return ref==r;
    }
    public String toString(){
      return ref.substring(0,2)+"-"+ref.substring(2,5)+"-"+ref.substring(5);

    }
    
}
