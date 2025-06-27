/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.pkg1;

import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class ListaCantantesFamosos {
    private ArrayList<String> array=new ArrayList<String>();
    public ListaCantantesFamosos(){
        array.add("Estopa");
        array.add("Ghost");
        array.add("Creeper");
    }
    public void añadir(String cantante){
        if(!array.add(cantante)){
            System.out.println("No se ha podido añadir al cantante");
        }
    }
    public String toString(){
        String texto= "";
        for(int i=0;i<array.size();i++){
            texto+=array.get(i);
        }
        return texto;
    }
}
