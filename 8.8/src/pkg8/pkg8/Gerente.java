/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.pkg8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mateo
 */
public class Gerente {
    private ArrayList<Cliente>l;
    public Gerente(){
        l=new ArrayList<Cliente>();
    }
    public void añadir(Cliente c){
        l.add(c);
    }
    public boolean borrar(String dni){
        Iterator<Cliente> it=l.iterator();
        while(it.hasNext()){
            if(it.next().getDni().equals(dni)){
                it.remove();
                return true;
            }
        }
        return false;
    }
    public void mostrar(String dni){
        Iterator<Cliente>it=l.iterator();
        while(it.hasNext()){
            Cliente c=it.next();
            if(c.getDni().equals(dni)){
                System.out.println(c);
            }
        }
    }
    public void mostrar(){
        Iterator<Cliente> it=l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
