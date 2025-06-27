/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void resultados(ArrayList<Integer> l){
        Iterator<Integer> it=l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
    public static void desplazar(ArrayList<Integer> l){
        l.add(0,l.remove(l.size()-1));
    }
    public static void main(String[] args) {
         ArrayList<Integer> l = new ArrayList<Integer>();
        
        final int MAX =15;
        
        for (int i=0; i< MAX; i++)
            l.add( (int)(Math.random()*10));
        
        //mostramos la lista
        resultados(l);
        
        System.out.println("Nuevo:");
        desplazar(l);
        
        resultados(l);
    }
    
}
