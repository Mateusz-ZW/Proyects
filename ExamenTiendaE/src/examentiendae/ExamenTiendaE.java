/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examentiendae;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class ExamenTiendaE {

    public static ArrayList<Electrodomestico>lista=new ArrayList();
    public static String nFichero="electrodomesticos.bin";
    
    
    public static int menu(){
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
        int op=0;
        while(op<1 || op> 3){
            System.out.println("1.Electrodomestico Pequeño");
            System.out.println("2. Electrodomestico grande con instalacion");
            System.out.println("3. Electrodomestico grande sin instalacion");
            op=Util.leerInt();
        }
        return op;
    }
    public static int menuTipo(){
        int op=0;
        while(op<1 || op>2 ){
            System.out.println("1.Electrodomestico Pequeño");
            System.out.println("2.Electrodomestico Grande");
            op=Util.leerInt();
            
        }
        return op;
    }
    public static void listar(){
        Iterator<Electrodomestico>it=lista.iterator();
        while(it.hasNext()){
            Electrodomestico e=it.next();
            System.out.println(e);
        }
    }
    public static void listarPE(){
       Iterator<Electrodomestico>it=lista.iterator();
        while(it.hasNext()){
            Electrodomestico e=it.next();
            if(e instanceof ElectrodomesticoP)
            System.out.println(e);
        }
    }
    public static void listarGE(){
          Iterator<Electrodomestico>it=lista.iterator();
        while(it.hasNext()){
            Electrodomestico e=it.next();
            if(e instanceof ElectrodomesticoG)
            System.out.println(e);
        }
    }
    public static Electrodomestico buscar(String cod){
        Iterator<Electrodomestico> it=lista.iterator();
        while(it.hasNext()){
            Electrodomestico e=it.next();
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
                lista=(ArrayList<Electrodomestico>)ois.readObject();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            catch(ClassNotFoundException ex){
                ex.printStackTrace();
            }
            finally{
              try
              {
                 if(ois!=null)
                  {
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
        System.out.println("Electrodomestico a añadir: ");
        int op=menuElectro();
        String cod="";
        
        while(!Codigo.esCorrecto(cod)){
            System.out.println("Dime el codigo: ");
            cod=sc.nextLine();
        }
        Codigo c=new Codigo(cod);
        System.out.println("Descripcion: ");
        String desc=sc.nextLine();
        System.out.println("Fabricacion: ");
        String fab=sc.nextLine();
        System.out.println("Modelo: ");
        String mod=sc.nextLine();
        System.out.println("Stock: ");
        int stock=Util.leerInt();
        System.out.println("Precio: ");
        double precio=Util.leerDouble();
        
        switch(op){
            case 1: lista.add(new ElectrodomesticoP(c,desc,fab,mod,stock,precio));break;
            case 2,3:
                System.out.println("Dime el peso: ");
                double peso=Util.leerDouble();
                System.out.println("Dime el alto: ");
                double alto=Util.leerDouble();
                System.out.println("Dime el ancho: ");
                double ancho=Util.leerDouble();
                System.out.println("Dime el fondo: ");
                double fondo=Util.leerDouble();
                if(op==2){
                    lista.add(new ElectrodomesticoGI(c,desc,fab,mod,stock,precio,peso,alto,ancho,fondo));
                }
                else{
                    lista.add(new ElectrodomesticoGSI(c,desc,fab,mod,stock,precio,peso,alto,ancho,fondo));

                }
        }
        
    }
    
    public static void vender(){
       Scanner sc=new Scanner(System.in);
        System.out.println("¿Que tipo quieres vender?");
        int op=menuTipo();
        boolean terminado=false;
        while(!terminado){
            if(op==1){
                listarPE();
            }
            else{
                listarGE();
            }
            System.out.println("Dime el codigo: ");
            String codigo=sc.nextLine();
            Electrodomestico e=buscar(codigo);
            if(e==null){
                System.out.println("No se ha encotrado el electrodomestico");
                
            }
            else{
                
                System.out.println("Dime la cantidad que quieres vender: ");
                int cantidad=Util.leerInt();
                if(e.getStock()>cantidad){
                    e.setStock(e.getStock()-cantidad);
                    terminado=true;
                    System.out.println("Se ha vendido el electrodomestico correctamemte y a un precio de: "+e.calcularPrecio()*cantidad);
                    
                }
                else{
                    System.out.println("Producto no disponible");
                }
                
            }
        }
    }
    public static void eliminar(){
        Scanner sc=new Scanner(System.in);
        Iterator<Electrodomestico>it=lista.iterator();
        listar();
        System.out.println("Dime el codigo del electrodomestico a eliminar: ");
        String cod=sc.nextLine();
        Electrodomestico e=buscar(cod);
        if(e==null){
            System.out.println("No se ha encontrado el electrodomestico");
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
               case 1: añadir();break;
               case 2: vender();break;
               case 3: eliminar();break;
           }
           op=menu();
       }
       guardarFichero();
    }
    
}
