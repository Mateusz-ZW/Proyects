    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg2;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
import java.util.ArrayList;
public class Main {

    /**
     * @param args the command line arguments
     */
     public static int numeroAlumnos(){
            Scanner sc=new Scanner(System.in);
            while(true){
                try{
                    System.out.println("Dime el numero de alumnos: ");
                    return sc.nextInt();
                }
                catch(Exception e){
                    System.out.println("Valor incorrecto");
                    sc.nextLine();
                }
            }
            
        }
     public static void leerAlturas(ArrayList<Double>l,int n){
         Scanner sc=new Scanner(System.in);
         while(l.size()<n){
             System.out.println("Dime la altura: ");
             try{
                 l.add(sc.nextDouble());
             }
             catch(Exception e){
                 System.out.println("Error");
                 sc.nextLine();
             }
         }
     }
     public static void mostrarResultado(ArrayList<Double>l,double m){
         int inf=0,igual=0,sup=0;
         for(int i=0;i<l.size();i++){
             System.out.println("Altura del alumno: "+(i+1)+"es: "+l.get(i));
             if(l.get(i)<m){
                 inf++;
             }
             else if(l.get(i)==m){
                 igual++;
             }
             else 
                 sup++;
         }
         System.out.println("Inferiores: "+inf
                            +"Iguales: "+igual+"Superiores: "+sup);
     }
     public static double calcularMedia(ArrayList<Double>l){
         double suma=0;
         for(int i=0;i<l.size();i++){
             suma+=l.get(i);
         }
         return suma/l.size();
     }
       
    public static void main(String[] args) {
       //definimos el arraylist 
       ArrayList<Double> alturas=new ArrayList<Double>();
       int n=numeroAlumnos();
       leerAlturas(alturas,n);
       mostrarResultado(alturas,calcularMedia(alturas));
        
    }
    
}
