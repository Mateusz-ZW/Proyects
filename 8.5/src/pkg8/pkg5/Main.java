/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void leerArray(ArrayList<String> l){
        Scanner sc=new Scanner(System.in);
         String cadena="";
        System.out.println("Dime cadenas de caracteres: ");
        cadena=sc.nextLine();
       
        while(!cadena.equals("FIN")){
         
        l.add(cadena);
        cadena=sc.nextLine();
        }
    }
    public static String cadenaMasLarga(ArrayList<String> l){
        String cadena="";
        String c="";
        Iterator<String> it=l.iterator();
        while(it.hasNext()){
            c=it.next();
            if(cadena.length()<c.length()){
                cadena=c;
            }
            
        }
        return cadena;
    }
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList();
        leerArray(l);
        System.out.println("La cadena mas larga es: "+cadenaMasLarga(l));
    }
       
    
}
