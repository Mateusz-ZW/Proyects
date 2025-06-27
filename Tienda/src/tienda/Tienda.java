/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Tienda {
    public static ArrayList <Electrodomestico> lista=new ArrayList();
    public static String nFichero="electro.dat";
    
    
    
    public static int menu(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op> 4){
            System.out.println("1.Añadir");
            System.out.println("2.Vender");
            System.out.println("3.Eliminar");
            System.out.println("4.Salir");
            op=sc.nextInt();
        }
        return op;
    }
    public static int menuElectro(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op> 3){
            System.out.println("1.Electrodomestico pequeño");
            System.out.println("2.Electrodomestico Grande Instalacion");
            System.out.println("3.Electrodomestico Grande Sin Instalacion");
            op=sc.nextInt();
            
        }
        return op;
    }
    public static int menuTipo(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op>2){
            System.out.println("1.Electrodomestico pequeño");
            System.out.println("2.Electronomestico grande");
            op=sc.nextInt();
        }
        return op;
    }
    public static void añadir(){
        Scanner sc=new Scanner(System.in);
        int op=menuElectro();
        String cod="";
        while(!Codigo.esValido(cod)){
            System.out.println("Dime el codigo: ");
            cod=sc.nextLine();
            
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
                System.out.println("Stock no valido: ");
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
                System.out.println("Precio no valido: ");
                sc.nextLine();
            }
        }
        switch(op){
            case 1: lista.add(new ElectrodomesticoP(c,desc,fab,mod,stock,precio));
            break;
            case 2,3:
                leido=false;
                double peso=0;
                while(!leido){
                    try{
                    System.out.println("Dime el peso: ");
                    peso=sc.nextDouble();
                    leido=true;
                }catch(Exception e){
                        System.out.println("Peso invalido");
                        sc.nextLine();
                    }
                }
                leido=false;
                double alto=0;
                while(!leido){
                    try{
                        
                    }
                    catch(Exception e){
                        System.out.println("Altura no valida");
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
                    catch(Exception e ){
                        System.out.println("Ancho no valido");
                        sc.nextLine();
                    }
                }
                leido=false;
                double fondo=0;
                while(!leido){
                try{
                    System.out.println("Dime el fondo: ");
                    fondo=sc.nextDouble();
                    leido=true;
                }
                catch(Exception e){
                    System.out.println("Ancho no valido");
                    sc.nextLine();
                }
                }
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
        System.out.println("¿Que electrodomestico vas a vender?");
        int op=menuTipo();
        boolean terminado=false;
        while(!terminado){
            if(op==1)listarPE();
            else listarGE();
            
            System.out.println("Dime el codigo: ");
            String cod=sc.nextLine();
            
            Electrodomestico e=buscar(cod);
            if(e==null){
                System.out.println("No se ha encontrado el electrodomestico");
            }
            else{
              boolean leido=false;
              int cantidad=0;
              while(!leido){
                  try{
                  System.out.println("Dime la cantidad: ");
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
                  System.out.println("Se ha vendido el producto por un precio de: "+e.calcularPrecio()*cantidad);
              }
              else{
                  System.out.println("Producto no disponible");
              }
              
            }
        }
    }
    public static void cargarFichero(){
        File f=new File(nFichero);
        ObjectInputStream ois=null;
        if(f.exists()){
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
                 catch(Exception e)
                 {
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
    public static void listar(){
        Iterator<Electrodomestico> it =lista.iterator();
        while(it.hasNext()){
            Electrodomestico e=it.next();
            System.out.println(e);
        }
    }
     public static void listarGE(){
        Iterator<Electrodomestico> it =lista.iterator();
        while(it.hasNext()){
            Electrodomestico e=it.next();
            if(e instanceof ElectrodomesticosG){
                System.out.println(e);
        }
        }
    }
     public static void listarPE(){
        Iterator<Electrodomestico> it =lista.iterator();
        while(it.hasNext()){
            Electrodomestico e=it.next();
            if(e instanceof ElectrodomesticoP){
                System.out.println(e);
        }
        }
    }
    
    public static Electrodomestico buscar(String cod){
        Scanner sc=new Scanner(System.in);
        Iterator<Electrodomestico> it=lista.iterator();
        while(it.hasNext()){
            Electrodomestico e=it.next();
            if(e.getCodigo().equals(cod)){
                return e;
            }
        }
        return null;
    }
    public static void eliminar(){
        Iterator<Electrodomestico>it=lista.iterator();
        listar();
        Scanner sc =new Scanner(System.in);
        System.out.println("Dime el codigo: ");
        String cod=sc.nextLine();
        Electrodomestico e=buscar(cod);
        if(e==null){
            System.out.println("No se pudo encontrar el electrodomestico");  
        }
        else{
            lista.remove(e);
            System.out.println("Electrodomestico eliminado");
        }
    }
    public static void main(String[] args) {
        cargarFichero();
        int op=menu();
        while(op!=4)
        {
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
