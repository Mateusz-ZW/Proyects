/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaelectro;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class TiendaElectro {
    public static ArrayList<Electrodomestico> lista=new ArrayList();
    public static String nFichero="elec.dat";
    
    public static int menu(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op >4){
            System.out.println("1.Añadir electrodomestico");
            System.out.println("2.Vender electrodomestico");
            System.out.println("3.Eliminar electrodomestico");
            System.out.println("4.Salir");
            op=sc.nextInt();
        }
        return op;
    }
    public static int menuElectro(){
        int op=0;
        Scanner sc=new Scanner(System.in);
        while(op<1 || op> 3){
            System.out.println("1.Pequeño electrodomestico");
            System.out.println("2.Electrodomestico Grande Instalacion");
            System.out.println("3.Electrodomestico Grande sin Instalacion");
            op=sc.nextInt();
        }
        return op;
    }
    public static int menuTipo(){
        int op=0;
        Scanner sc=new Scanner(System.in);
        while(op<1 || op>2){
            System.out.println("1.Gran Electrodomestico");
            System.out.println("2.Pequeño Electrodomestico");
            op=sc.nextInt();
            
        }
        return op;
    }
    public static void cargarFichero(){
        File f=new File(nFichero);
        if(f.exists()){
            ObjectInputStream ois=null;
            try{
                ois=new ObjectInputStream(new FileInputStream(f));
                lista=(ArrayList<Electrodomestico>)ois.readObject();
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
    public static void listar(){
        Iterator<Electrodomestico> it =lista.iterator();
        while(it.hasNext()){
            Electrodomestico e=it.next();
            System.out.println(e);
        }
    }
    public static void listarGE(){
        Iterator<Electrodomestico> it=lista.iterator();
        while(it.hasNext()){
            Electrodomestico e=it.next();
            if(e instanceof GranElectrodomestico){
                System.out.println(e);
            }
        }
    }
    public static void listarPE(){
        Iterator<Electrodomestico> it=lista.iterator();
        while(it.hasNext()){
            Electrodomestico e=it.next();
            if(e instanceof ElectrodomesticoP){
                System.out.println(e);
            }
        }
    }
    public static Electrodomestico buscar(String cod){
        Iterator<Electrodomestico>it=lista.iterator();
        while(it.hasNext()){
            Electrodomestico e=it.next();
            if(e.getCodigo().equals(cod)){
                return e;
            }
        }
        return null;
    }
    public static void añadir(){
        int op=menuElectro();
        Scanner sc=new Scanner(System.in);
        String cod="";
        
        
        while(!Codigo.esValido(cod)){
            System.out.println("Indique el codigo: ");
            cod=sc.nextLine();
            if(!Codigo.esValido(cod)){
            System.out.println("Codigo no valido, indique otro");
            
            }
        }
        Codigo c=new Codigo(cod);
        System.out.println("Descripcion: ");
        String desc=sc.nextLine();
        System.out.println("Fabricante: ");
        String fab=sc.nextLine();
        System.out.println("Modelo: ");
        String mod=sc.nextLine();
        boolean leido=false;
        int stock=0;
        while(!leido){
            try{
            System.out.println("Dime el stock: ");
            stock=sc.nextInt();
            leido=true;
            }
            catch(Exception e){
                System.out.println("Stock no valido");
                sc.nextLine();
            }
        }
        leido=false;
        double precio=0;
        while(!leido){
            try{
                System.out.println("Dime el precio: ");
                precio=sc.nextDouble();
                leido=true;
            }
            catch(Exception e){
                System.out.println("Precio no valido");
                sc.nextLine();
            }
        }
        switch(op){
            case 1: lista.add(new ElectrodomesticoP(c,desc,fab,mod,stock,precio));break;
            case 2,3: 
                leido=false;
                double peso=0;
                while(!leido){
                    try{
                        System.out.println("Dime el peso: ");
                        peso=sc.nextDouble();
                        leido=true;
                    }
                    catch(Exception e){
                        System.out.println("Peso no valido");
                        sc.nextLine();
                    }
                }
                leido=false;
                double alto=0;
                while(!leido){
                    try{
                    System.out.println("Dime el alto: ");
                    alto=sc.nextDouble();
                    leido=true;
                }
                catch(Exception e){
                    System.out.println("Peso no valido");
                    sc.nextLine();
                        }
                }
                leido=false;
                double ancho=0;
                while(!leido){
                    try{
                        System.out.println("Ancho: ");
                        ancho=sc.nextDouble();
                        leido=true;
                        
                    }
                    catch(Exception e){
                        System.out.println("Ancho no valido");
                        sc.nextLine();
                    }
                }
                leido=false;
                double fondo=0;
                while(!leido)
                {
                    try{
                        System.out.println("Fondo: ");
                    fondo=sc.nextDouble();
                    leido=true;
                    }
                    catch(Exception e){
                        System.out.println("Fondo no valido");
                        sc.nextLine();
                    }
                    
                }
                if(op==2){
                    lista.add(new ElectrodomesticoGI(c,desc,fab,mod,stock,precio,peso,alto,ancho,fondo));
                }
                else{
                     lista.add(new ElectrodomesticoGNI(c,desc,fab,mod,stock,precio,peso,alto,ancho,fondo));

                }
                 
        }
    }
    public static void vender(){
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Que tipo de electrodomestico desea vender?");
        int op=menuTipo();
        boolean terminado=false;
        while(!terminado){
            if(op==1){
                listarPE();
            }
            else listarGE();
        }
        System.out.println("Indica el codigo: ");
        String cod=sc.nextLine();
        Electrodomestico e=buscar(cod);
        if(e==null){
            System.out.println("Codigo no encontrado");
        }
        else{
            boolean leido=false;
            int cantidad=0;
            while(!leido){
                try{
                System.out.println("Cantidad a vender: ");
                cantidad=sc.nextInt();
                leido=true;
                }
                catch(Exception ex){
                    System.out.println("Cantidad no valida");
                    sc.nextLine();
                }
            }
            if(e.getStock()>cantidad){
                e.setStock(e.getStock()-cantidad);
                terminado=true;
                System.out.println("Se ha realizado la venta por un importe de "+e.calcularPrecio()*cantidad);
            }
            else{
                System.out.println("No esta disponible el producto");
            }
        }
    }
    public static void eliminar(){
        Scanner sc=new Scanner(System.in);
        listar();
        System.out.println("Indica el codigo: ");
        String cod=sc.nextLine();
        Electrodomestico e=buscar(cod);
        if(e==null){
            System.out.println("No se ha encotrado el electrodomestico");
        }
        else{
            lista.remove(e);
            System.out.println("Electrodomestico eliminado");
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
    public static void main(String[] args) {
       cargarFichero();
       int op=menu();
       while(op!=4){
           switch(op){
               case 1:añadir();break;
               case 2:vender();break;
               case 3:eliminar();break;
           }
           op=menu();
           
       }
       guardarFichero();
    }
    
}
