/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg2.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int numeroAlumnos(){
        Scanner sc=new Scanner(System.in);
        while(true){
            try{
                System.out.println("Dime el numero de alumnos: ");
                int alumnos=sc.nextInt();
            }
            catch(Exception e){
                System.out.println("Error");
                sc.nextLine();
            }
        }
    }
    public static void leerAlturas(ArrayList<Double> l,int n){
         Scanner sc=new Scanner(System.in);
         while(l.size()<n){
             System.out.println("Dime la altura: ");
             try{
                 l.add(sc.nextDouble());
             }
             catch(Exception e){
                 System.out.println("Valor incorrecto");
                 sc.nextLine();            
             }
         }
         
    }
      public static void mostarResultados(ArrayList<Double>l, double m)
    {
        //tres variables para saber cuantos están por debajo, encima
        //e igual a la media
        int inf=0, sup=0, igual=0;
        
        for (int i=0; i<l.size();i++)
        {
            System.out.println("Altura del alumno "+(i+1)+" es: "+l.get(i));
            if (l.get(i)<m) //menor
                inf++;
            else if (l.get(i)>m)//mayor
                sup++;
            else //igual
                igual++;
        }    
        System.out.println("Superiores: "+sup+
                            "\nInferiores: "+inf+
                            "\nIguales: "+igual);
        
    }  
      public static double calcularMedia(ArrayList <Double> l)
    {
    
        double suma=0;
        for (int i=0; i< l.size(); i++)
            suma+=l.get(i);
        
        return suma/l.size();
    }  
    public static void main(String[] args) {
       ArrayList<Double> alturas = new ArrayList<Double>();
        
        //Llamamos a calcular el número de alumnos
        int n = numeroAlumnos();
        //Llamamos a leer las alturas
        leerAlturas(alturas,n );
        //Mostramos los resultados
        
        mostarResultados(alturas, calcularMedia(alturas));
    }
    
}
