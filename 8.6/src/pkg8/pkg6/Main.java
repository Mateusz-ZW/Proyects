/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg6;

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
    public static ArrayList<Producto> generarLista(){
        ArrayList<Producto> lista=new ArrayList<Producto>();
        int n=(int)(Math.random()*8+1);
        
        for(int i=0; i<n;i++){
            lista.add(new Producto());
            
        }
        return lista;
    }
    public static void mostrarTicket(ArrayList<Producto>l){
         System.out.println("***********Cantidad****Precio****Total");
        double total=0;
        Iterator<Producto> it = l.iterator();
        while (it.hasNext())
        {
            Producto p=it.next();
            System.out.println(p);
            total+=p.getTotalPrecio();
            
        }
        System.out.println("Precio total: "+total);
    }
    public static void main(String[] args) {
      mostrarTicket(generarLista());
    }
    
}
