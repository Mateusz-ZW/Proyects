/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa1;

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
        this.ref = ref;
    }
    public static boolean refValida(String r){
        if(r.length()!=8){
            return false;
        }
        if(r.charAt(0)=='-'){
            return false;
        }
        try{
            Integer.parseInt(r);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public boolean equals(String r){
        return ref==r;
    }
    @Override
    public String toString() {
        return ref.substring(0,2)+"-"+ref.substring(2,5)+"-"+ref.substring(5);
        
    }
    
    
}
