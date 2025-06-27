/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenelectrodomesticos;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class ExamenElectrodomesticos {

    public static ArrayList<Electrodomesticos> lista=new ArrayList();
    public static String nFichero="electro.bin";
    
    public static int menu(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op>4){
            System.out.println("1.Añadir Electrodomestico");
            System.out.println("2.Vender Electrodomestico");
            System.out.println("3.Eliminar Electrodomestico");
            System.out.println("4.Salir");
            op=Util.leerInt();
        }
        return op;
    }
    public static int menuElectro(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op>3){
            System.out.println("1.Electrodomestico Pequeño");
            System.out.println("2.Electrodomestico Grande sin Instalacion");
            System.out.println("3.Electrodomestico Grande con Instalacion");
            op=Util.leerInt();
        }
        return op;
    }
    public static int menuElectroVenta(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op>2){
            System.out.println("1.Electrodomestico Pequeño ");
            System.out.println("2.Electrodomestico Grande");
            op=Util.leerInt();
            
        }
        return op;
    }
    public static void listarPE(){
        Iterator<Electrodomesticos> it=lista.iterator();
        while(it.hasNext()){
            Electrodomesticos e=it.next();
            if(e instanceof ElectrodomesticosP){
                System.out.println(e);
            }
        }
    }
    public static void listarGE(){
        Iterator<Electrodomesticos> it=lista.iterator();
        while(it.hasNext()){
            Electrodomesticos e=it.next();
            if(e instanceof ElectrodomesticosG){
                System.out.println(e);
            }
        }
    }
    public static void listar(){
        Iterator<Electrodomesticos> it=lista.iterator();
        while(it.hasNext()){
            Electrodomesticos e=it.next();
            System.out.println(e);
        }
    }
    public static Electrodomesticos buscar(String cod){
        Iterator<Electrodomesticos> it=lista.iterator();
        while(it.hasNext()){
            Electrodomesticos e=it.next();
            if(e.getCodigo().equals(cod)){
                return e;
            }
        }
        return null;
    }
    
    public static void cargarFichero(){
        File f=new File(nFichero);
        if(f.exists()){
            ObjectInputStream ois=null;
            try{
                ois=new ObjectInputStream(new FileInputStream(f));
                lista=(ArrayList<Electrodomesticos>)ois.readObject();
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
                    
                }catch(Exception e){
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
    public static void añadirElectrodomestico(){
        Scanner sc=new Scanner(System.in);
        int op=menuElectro();
        String cod="";
        while(!Codigo.esValido(cod)){
            System.out.println("Indica el codigo: ");
            cod=sc.nextLine();
            if(!Codigo.esValido(cod)){
                System.out.println("Codigo no valido");
            }
        }
        Codigo c=new Codigo(cod);
        System.out.println("Descripcion: ");
        String desc=sc.nextLine();
        System.out.println("Fabricante: ");
        String fab=sc.nextLine();
        System.out.println("Modelo: ");
        String modelo=sc.nextLine();
        boolean leido=false;
        int stock=0;
        while(!leido){
            try{
                System.out.println("Stock: ");
                stock=Util.leerInt();
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
               System.out.println("Precio: ");
               precio=Util.leerDouble();
               leido=true;
               
           } 
           catch(Exception e){
               System.out.println("Precio no valido");
               sc.nextLine();
           }
        }
        switch(op){
            case 1: lista.add(new ElectrodomesticosP(c,desc,fab,modelo,stock,precio));
            break;
            case 2,3:
                leido=false;
                double peso=0;
                while(!leido){
                    try{
                        System.out.println("Peso: ");
                        peso=Util.leerDouble();
                        leido=true;
                    }
                    catch(Exception e){
                        System.out.println("Numero no valido"); 
                        sc.nextLine();
                    }
                }
                leido=false;
                double alto=0;
                while(!leido){
                    try{
                        System.out.println("Altura: ");
                        alto=sc.nextDouble();
                        leido=true;
                    }
                    catch(Exception e){
                        System.out.println("Numero no valido");
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
                        System.out.println("Numero no valido");
                        sc.nextLine();
                    }
                }
                leido=false;
                double fondo=0;
                while(!leido){
                    try{
                        System.out.println("Fondo: ");
                        fondo=sc.nextDouble();
                        leido=true;
                    }
                    catch(Exception e){
                        System.out.println("Numero no valido");
                        sc.nextLine();
                    }
                }
                if(op==2){
                   lista.add(new ElectrodomesticosGI(c,desc,fab,modelo,stock,precio,peso,alto,ancho,fondo));
                }
                else{
                   lista.add(new ElectrodomesticosGSI(c,desc,fab,modelo,stock,precio,peso,alto,ancho,fondo));

                }
        
        }
    }
    public static void venderElectrodomestico(){
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Que tipo de electrodomestico desea comprar?");
        int op=menuElectroVenta();
        boolean terminado=false;
        while(!terminado){
            if(op==1) listarPE();
            else listarGE();
            System.out.println("Indica el codigo: ");
            String cod=sc.nextLine();
            Electrodomesticos e=buscar(cod);
            if(e==null){
                System.out.println("No se ha encontrado el codigo");
            }
            else{
                boolean leido=false;
                int cantidad=0;
                while(!leido){
                    try{
                        System.out.println("Indica la cantidad: ");
                        cantidad=sc.nextInt();
                        leido=true;
                    }
                    catch(Exception ex){
                        System.out.println("Cantidad no valida");
                        sc.nextLine();
                    }
                }
                if(e.getStock()>=cantidad){
                    e.setStock(e.getStock()-cantidad);
                    terminado=true;
                    System.out.println("Se ha realizado la venta por un importe de: "+e.calcularPrecio()*cantidad);
                    
                }
                else{
                    System.out.println("No hay disponibilidad del producto");
                }
            }
        }
    }
    public static void eliminar(){
        Scanner sc=new Scanner(System.in);
        listar();
        System.out.println("Dime el codigo: ");
        String codigo=sc.nextLine();
        Electrodomesticos e=buscar(codigo);
        if(e==null){
            System.out.println("Codigo no encontrado");
        }
        else{
            lista.remove(e);
            System.out.println("Electrodomestico eliminado correctamente");
        }
    }
    public static void main(String[] args) {
       cargarFichero();
       int op=menu();
       while(op!=4){
           switch(op){
               case 1:añadirElectrodomestico();break;
               case 2:venderElectrodomestico();break;
               case 3:eliminar();break;
               
           }
           op=menu();
       }
       guardarFichero();
    }
    
}
