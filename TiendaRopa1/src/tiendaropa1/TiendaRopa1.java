/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaropa1;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class TiendaRopa1 {

    public static ArrayList<Articulo> lista =new ArrayList();
    public static String nFichero="trbajos.bin";
    
    public static int menu(){
        int op=0;
        while(op<1 || op >4){
            System.out.println("1.Añadir");
            System.out.println("2.Comprar");
            System.out.println("3.Devolver");
            System.out.println("4.Salir");
            op=Util.leerInt();
        }
        return op;
    }
    public static int menuTipo(){
        int op=0;
        while(op<1 || op >3){
            System.out.println("1.Accesorio");
            System.out.println("2.Articulo de ropa sin devolucion");
            System.out.println("3.Artiulo de ropa con devolucion");
            op=Util.leerInt();
            
        }
        return op;
        
    }
    public static void cargarFichero(){
        File f=new File(nFichero);
        if(f.exists()){
            ObjectInputStream ois=null;
            try{
                ois=new ObjectInputStream(new FileInputStream(f));
                lista=(ArrayList<Articulo>)ois.readObject();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            catch(ClassNotFoundException ex){
                ex.printStackTrace();
            
            }
            finally{
                try{
                    if(ois!=null){
                        ois.close();
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    public static void guardarFichero(){
        ObjectOutputStream oos=null;
        try{
            oos=new ObjectOutputStream(new FileOutputStream(nFichero));
            oos.writeObject(lista);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(oos!=null){
                    oos.close();
                }
            }
            catch(Exception e){
               e.printStackTrace();
            }
        }
    }
    
    public static void añadir(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el tipo de articulo a añadir: ");
        int op=menuTipo();
        System.out.println("Dime la referencia: ");
        String ref=sc.nextLine();
        while(!Referencia.refValida(ref)){
            System.out.println("Referencia no valida");
            System.out.println("Dime otra referencia");
            sc.nextLine();
        }
        Referencia r=new Referencia(ref);
        System.out.println("Descripcion: ");
        String desc=sc.nextLine();
        
        System.out.println("Dime la cantidad: ");
        int cantidad=Util.leerInt();
        System.out.println("Dime el precio: ");
        double precio=Util.leerDouble();
        if(op==1){
            lista.add(new Accesorio(r,desc,cantidad,precio));
            
        }
        else{
            System.out.println("Dime la talla: ");
            String talla=sc.nextLine();
            while(!Prenda.tallaValida(talla)){
                System.out.println(" Talla no correcta: ");
                talla=sc.nextLine();
                
            }
            if(op==2){
                lista.add(new Prenda(r,desc,cantidad,precio,talla));
            }
            else{
                lista.add(new PrendasConDev(r,desc,cantidad,precio,talla));
            }
        }
        
    }
    public static Articulo buscar(String r){
        Iterator<Articulo> it=lista.iterator();
        while(it.hasNext()){
            Articulo a=it.next();
            if(a.getRef().equals(r)){
                return a;
            }
        }
        return null;
    }
    public static void listar(){
        Iterator<Articulo> it=lista.iterator();
        while(it.hasNext()){
            Articulo a=it.next();
            System.out.println(a);
            
        }
    }
    public static void comprar(){
        Scanner sc=new Scanner(System.in);
        listar();
        System.out.println("Dime la referencia del articulo: ");
        String ref=sc.nextLine();
        while(!Referencia.refValida(ref)){
            System.out.println("Referencia no valida, introduce otra");
            ref=sc.nextLine();
        }
        Articulo a=buscar(ref);
        if(a==null){
            System.out.println("No se ha encontrado el articulo");
        }
        else{
            System.out.println("Dime la cantidad : ");
            int cantidad=Util.leerInt();
            if(cantidad>=a.getCantidad()){
                a.setCantidad(a.getCantidad()-cantidad);
                System.out.println("Importe de la venta: "+a.getPrecio()*cantidad);
            }
            else{
                System.out.println("No hay disponibilidad del articulo");
            }
            
        }
    }
    public static void devolver(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime la referencia: ");
        String ref=sc.nextLine();
        while(!Referencia.refValida(ref)){
            System.out.println("Referencia no valida, indique otra: ");
            ref=sc.nextLine();
        }
        Articulo a =buscar(ref);
        if(a==null){
            System.out.println("Articulo no encontrado");
        }
        else{
            if(a instanceof Accesorio || a instanceof PrendasConDev){
                System.out.println("Dime los dias: ");
                int dias=Util.leerInt();
                double dev=0;
                if(a instanceof Accesorio){
                    dev=((Accesorio)a).devolver(dias);
                }
                else{
                    dev=((PrendasConDev)a).devolver(dias);  
                }
                if(dev==-1){
                    System.out.println("Superado el plazo");
                }
                else{
                    System.out.println("Importe de devolucion: "+dev);
                }
            }
            else{
                System.out.println("No se puede devolver");
            }
        }
    }
    public static void main(String[] args) {
       cargarFichero();
       int op=menu();
       while(op!=4){
           switch(op){
               case 1:añadir();break;
               case 2:comprar();break;
               case 3:devolver();break;
           }
           op=menu();
       }
       guardarFichero();
    }
    
}
