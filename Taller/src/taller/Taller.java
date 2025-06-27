/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Taller {

    public static ArrayList<Trabajo> lista=new ArrayList();
    public static String nFichero="trabajos.dat";
    
    public static int menu(){
        int op=0;
        while(op<1 || op>7){
            System.out.println("1.Nuevo Trabajo");
            System.out.println("2.Añadir Horas");
            System.out.println("3.Añadir Material");
            System.out.println("4.Finalizar trabajo y generar Factura");
            System.out.println("5.Eliminar trabajo");
            System.out.println("Listar trabajos");
            System.out.println("7.Salir");
            op=Util.leerInt();
            
        }
        return op;
        
    }
    public static int menuNuevo(){
        int op=0;
        while(op<1 ||op>3){
            System.out.println("1.Revision");
            System.out.println("2.Reparacion mecanica");
            System.out.println("3.Reparacion chapa y pintura");
            op=Util.leerInt();
        }
        return op;
    }
    public static void nuevoTrabajo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el tipo de trabajo: ");
        int op=menuNuevo();
        Trabajo t=null;
        System.out.println("Descripcion: ");
        String desc=sc.nextLine();
        switch(op){
            case 1: t=new Revision(desc);break;
            case 2: t=new RMecanica(desc);break;
            case 3: t=new RChapaPintura(desc);break;
        }
        lista.add(t);
        
    }
    public static Trabajo buscar(String cod){
        Iterator<Trabajo> it=lista.iterator();
        while(it.hasNext()){
            Trabajo t=it.next();
            if(t.getCodigo().equals(cod)){
                return t;
            }
        }
        return null;
    }
    public static int añadirHoras(){
        Scanner sc=new Scanner(System.in);
          System.out.println("Dime el codigo del trabajo: ");
          String cod=sc.nextLine();
          System.out.println("Dime el numero de horas: ");
          int horas=Util.leerInt();
          Trabajo t=buscar(cod);
          if(t==null){
              System.out.println("No se encontro el trabajo");
          }
          else{
              
          }
        
    }
    public static void main(String[] args) {
       
    }
    
}
