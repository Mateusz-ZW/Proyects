/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg3;

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
    public static ArrayList<Integer> leerValores(){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>l=new ArrayList<Integer>();
        int valor=0;
        System.out.println("Introduce valores, termina con -99");
        while(valor !=-99){
            try{
                valor=sc.nextInt();
                if(valor!=-99){
                    l.add(valor);
                }
            }
            catch(Exception e){
                System.out.println("error");
                sc.nextLine();
                
            }
        }
        return l;
    }
    public static int calcularSuma(ArrayList<Integer>l){
        int suma=0;
        Iterator<Integer> it=l.iterator();
        while(it.hasNext()){
            suma+=it.next();
            
        }
        return suma;
        
    }
    public static void mostrarResultados(ArrayList<Integer>l,int suma,double media){
        int sup=0;
        int elemento=0;
        for(int i=0;i<l.size();i++){
            elemento=l.get(i);
            if(elemento>media)
                sup++;
            System.out.println(elemento+ " ");
        }
        System.out.println("Suma: "+calcularSuma(l));
        System.out.println("Media: "+media);
        System.out.println("Superiores a la media: "+sup);
        
    }
    public static void main(String[] args) {
      ArrayList<Integer>l=leerValores();
      int suma=calcularSuma(l);
      double media=(double) suma/l.size();
      mostrarResultados(l,suma,media);
    }
    
}
