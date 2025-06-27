/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ferreteria;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ferreteria {

    /**
     * @param args the command line arguments
     */
    
    public static ArrayList<Producto> p=new ArrayList<Producto>();
    public static String fichero="fdatos.bin";
    final static Scanner sc=new Scanner(System.in);
    
    public static int menu()
    {
        int op=0;
        while(op<1 || op>3){
            System.out.println("1.Registrar producto");
            System.out.println("2. Realizar compra");
            System.out.println("3. Salir");
            op=sc.nextInt();
        }
        return op;
    }
    
    
    public static void guardarDatos(){
        ObjectOutputStream oos= null;
        try{
            oos=new ObjectOutputStream(new FileOutputStream(fichero));
            oos.writeObject(p);
            
        }
        catch(IOException e){
            System.out.println("Error guardando los datos");
        }
        finally{
            try{
                if(oos!=null)
                    oos.close();
            }
            catch(IOException e){
                System.out.println("Error cerrando el fichero");
            }
        }
    
    }
    public static void recuperarDatos(){
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(fichero));
            p = (ArrayList<Producto>) ois.readObject();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error en los datos del fichero");
        }
        catch (FileNotFoundException e){}
        catch (IOException e)
        {
            System.out.println("Error leyendo el fichero");
        }
        catch (Exception e)
        {
            System.out.println("Error en los datos");
        }
        finally
        {
            try
            {
                if (ois!=null)
                    ois.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero");
            }
        }
    }
    public static void registrarProducto(){
        System.out.println("referencia: ");
        int ref=sc.nextInt();
        System.out.println("Descripcion: ");
        String desc=sc.nextLine();
        int tipo=0;
        while(tipo!=1 && tipo!=2){
            System.out.println("Indica el tipo de producto: ");
            System.out.println("1. AI peso o 2. Unidades");
            tipo=sc.nextInt();
            
        }
        if(tipo==1){
            System.out.println("Precio por kilo: ");
            double precio=sc.nextDouble();
            p.add(new ProductoUnidad(ref,desc,precio));
            
            
        }
    }
    public static void mostrarProductos(){
        Iterator <Producto> it=p.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
      
    }
    public static Producto buscar(int r){
        Iterator<Producto> it=p.iterator();
        while(it.hasNext()){
           Producto p=it.next();
           if(p.getReferencia()==r){
               return p;
           }
        }
        return null;
    }
    public static String generarFactura(ArrayList<Producto> c,ArrayList<Integer> pesos){
        
        double total=0;
        String factura= "FACTURA";
        for(int i=0;i<p.size();i++){
            Producto p=c.get(i);
            factura+=p.getReferencia()+p.getDescripcion();
            if(p instanceof ProductoUnidad){
                factura+=p.getPrecio();
                total+=p.getPrecio();
                
            }
            else{
                
            
                int pe=pesos.get(i);
               
                 factura+="\t"+pe+"grs\t"+((ProductoPeso)p).calcularPrecio(pe)+"€\n";
                
                }
          
        }
          factura+="\nTOTAL: "+total+"€";
        return factura;
    }
    
    
         public static void guardarFactura(String factura)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del fichero: ");
        String f = sc.nextLine();
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(f));
            bw.write(factura);
        }
        catch (IOException e)
        {
            System.out.println("Error escribiendo la factura");
        }
        finally
        {
            try
            {
                if (bw!=null)
                    bw.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero");
            }
            
            
            
        }
        
    }
          public static void realizarCompra()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> compra = new ArrayList<Producto>();
        ArrayList<Integer> pesos = new ArrayList<Integer>();
        
        mostrarProductos();
        System.out.print("Referencia (0 para terminar): ");
        int ref = sc.nextInt();
        while (ref!=0)
        {
            Producto p = buscar(ref);
            if (p==null)
                System.out.println("Producto no encontrado");
            else
            {
                int peso = 0;
                if (p instanceof ProductoPeso)
                {
                    System.out.print("Indica el peso en gramos: ");
                    peso = sc.nextInt();
                }
                compra.add(p);
                pesos.add(peso);
            }
            mostrarProductos();
            System.out.print("Referencia (0 para terminar): ");
            ref =sc.nextInt();
        }
        String factura = generarFactura(compra, pesos);
        System.out.println(factura);
        int op = 0;
        while (op!=1 && op!=2)
        {
            System.out.println("¿Desea guardar la factura en un fichero?\n1.Si\n2.No");
            op = sc.nextInt();
            if (op==1)
            {                
                guardarFactura(factura);
            }
        }
    }
    
    public static void main(String[] args) {
       recuperarDatos();
       int op=menu();
       while(op!=3){
           switch(op){
               case 1:registrarProducto();
               break;
               case 2: realizarCompra();
               break;
               
           }
           op=menu();
       }
       guardarDatos();
    }
    
}
