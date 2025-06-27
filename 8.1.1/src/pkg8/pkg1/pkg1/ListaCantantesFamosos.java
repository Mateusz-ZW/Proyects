/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.pkg1.pkg1;

import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class ListaCantantesFamosos {
   private ArrayList<String> l=new ArrayList();
    public ListaCantantesFamosos(){
        l.add("Mario");
        l.add("Paco");
        l.add("Mateo");
    
    }
    public void añadir(String cantante){
        if(!l.add(cantante)){
            System.out.println("No se ha podido añadir al cantante");
        }
        
    }

    @Override
    public String toString() {
          String texto="";
        
        for (int i=0; i < l.size(); i++)
            texto+=l.get(i)+"\n";
        
        return texto;
    }
    
}
