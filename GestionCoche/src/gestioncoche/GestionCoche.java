/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioncoche;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class GestionCoche {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Coche> arr=new ArrayList();
    
    private static Coche c=new Coche();
    private static Scanner sc=new Scanner(System.in);
    public static int menu(){
        int op=0;
        while(1<=op || op>=5){
        System.out.println("1.Añadir coche");
        System.out.println("2.Quitar coche");
        System.out.println("3.Mostar informacion sobre los coches");
        System.out.println("4.Salir");
        op=sc.nextInt();
    }
        return op;
    }
    
    public static Coche añadirCoche(){
       
        ArrayList<Coche> arr=new ArrayList();
        System.out.println("Dime la marca del coche: ");
        String marca=sc.nextLine();
        String tipo="";
        
        System.out.println("Dime de que tipo es: ");
         tipo=sc.nextLine();
        
        if(tipo.charAt(0)=='d'){
            System.out.println("Es de tipo diesel");
        }
        else if(tipo.charAt(0)=='g'){
            System.out.println("Es de tipo gasolina");
        }
        System.out.println("Dime la matricula que quieres que tenga el coche: ");
        String matricula=sc.nextLine();
        
        return new Coche(marca,tipo,matricula);
    }
    public static void borrarCoche(String matricula){
        System.out.println("Dime la matricula del coche que quieres borrar: ");
        String mat=sc.nextLine();
        
        if(c.getMatricula().equals(mat)){
            arr.remove( new Coche(matricula));
        }
    }
   /* public static ArrayList<Coche> mostrarInf(ArrayList<Coche> arr){
        Coche c=new Coche();
        Iterator it=
        
    */
    public static void main(String[] args) {
        System.out.println("Dime una matricula: ");
        String matricula=sc.nextLine();
        int op=0;
        while(op!=4){
             op=menu();
            switch(op){
                case 1: añadirCoche();
                break;
                
            
            case 2: borrarCoche(matricula);
            break;
            
           // case 3: mostrarInf(arr);
         //   break;
            
            default: System.out.println("Introduce un numero que no sea 4(Salir)");
            
        }
    }
    }
    
}
