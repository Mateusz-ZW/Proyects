/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printacio;

import java.util.ArrayList;
import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Printacio {

    /**
     * @param args the command line arguments
     */
    
    public static ArrayList<Filamento> filamentos=new ArrayList();
    public static String fDatos ="printacio.bin";
    public static Scanner sc=new Scanner(System.in);
    
    public static void guardarDatos(){
        ObjectOutputStream oos=null;
        try{
            oos=new ObjectOutputStream(new FileOutputStream("printacio.bin"));
            oos.writeObject(filamentos);
        }
        catch(IOException e){
            System.err.println("Error guardando los datos");
        }
        finally{
            try{
                if(oos!=null){
                    oos.close();
                }
            }
            catch(IOException e){
                System.err.println("Error cerrando el fichero");
            }
        }
        
    }
    public static void recuperarDatos(){
        ObjectInputStream ois=null;
        try{
            ois=new ObjectInputStream(new FileInputStream("printacio.bin"));
            filamentos=(ArrayList<Filamento>)ois.readObject();
            
        }catch(Exception e){
            System.out.println("No se han podido recuperar los datos de filamentos");
            
        }
        finally{
            try{
                if(ois!=null){
                    ois.close();
                    
                }
              
                        
                        }
              catch(IOException e){
                  System.err.println("Error cerrando el fichero");
            }
        }
    }
    public static int menu(){
        int op=0;
        while(1<op || op>4){
            System.out.println("1.Añadir Filamento");
            System.out.println("2.Mostrar Filamentos");
            System.out.println("3.Encargar pieza");
            System.out.println("4.Salir");
            op=sc.nextInt();
            
        }
        return op;
    }
    public static int tipoFilamento(){
        int op=0;
        while(op<1 || op>2){
            System.out.println("Tipo de filamento");
            System.out.println("1.PLA");
            System.out.println("2.PETG");
            op=sc.nextInt();
            
        }
        return op;
        
    }public static int tipoPieza(){
        int op=0;
         while(op<1 || op>2){
            System.out.println("Tipo de pieza");
            System.out.println("1.Puramente decorativa");
            System.out.println("2.Pieza con resistencia");
            op=sc.nextInt();
         }
         return op;
    }
    public static Filamento buscar(String ref){
        Iterator<Filamento> it=filamentos.iterator();
        while(it.hasNext()){
        Filamento f=it.next();
        if(ref.equals(f.getRef())){
            return f;
        }
        
        
    }
        return null;
    }
      public static Filamento buscar(int tipo, String color, double peso)
    {
        Iterator<Filamento> it = filamentos.iterator();
        while (it.hasNext())
        {
            Filamento f = it.next();
            if (((tipo==1 && f instanceof PLA) || (tipo==2 && f instanceof PETG)) &&
                 f.getColor().equalsIgnoreCase(color) && (f.getPeso()*1000)>=peso)
                return f;
        }
        return null;
    }
        public static void anadirFilamento()
    {
        String ref = Util.leerString("Referencia: ");
        Filamento f = buscar(ref);
        if (f!=null)
        {
            System.out.println(f);
            double kilos = Util.leerDouble("Kilos a añadir: ");
            f.setPeso(kilos+f.getPeso());            
        }
        else
        {
            int tipo = tipoFilamento();
            String color = sc.nextLine("Color: ");
            double peso = Util.leerDouble("Peso en kilos: ");
            double precio = Util.leerDouble("Precio por kilo: ");
            if (tipo==1)
                filamentos.add(new PLA(ref,color,peso,precio));
            else
                filamentos.add(new PETG(ref,color,peso,precio));
                
        }
        
    }
         public static void mostrarFilamentos()
    {
        Iterator<Filamento> it = filamentos.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
    public static void guardarFactura(String fac)
    {
        String fichero = Util.leerString("Nombre del fichero de la factura: ");
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(fichero));
            bw.write(fac);
        }
        catch (IOException e)
        {
            System.out.println("Error emitiendo factura");
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
                System.err.println("Error cerrando el fichero");
            }
        }
        
    }
    
    public static void encargarPieza()
    {
        int tipo = tipoPieza();
        String color = Util.leerString("Color de la pieza: ");
        double peso = Util.leerDouble("Peso en gramos: ");
        Filamento f = buscar(tipo,color,peso);
        if (f!=null)
        {
            String factura = "FACTURA\n________\n\n"+f.toString()+
                    "\nPIEZA: \n\tPeso: "+peso+
                    "gr\n\tPrecio de venta: "+f.calcularPrecio(peso)+"€";
            System.out.println(factura);
            guardarFactura(factura);
            f.setPeso(f.getPeso()-peso/1000.0);
        }
        else
        {
            System.out.println("No disponemos del filamento necesario");
        }
    }
    public static void main(String[] args) {
         recuperarDatos();
        int op = menu();
        while (op!=4)
        {
            switch (op)
            {
                case 1: anadirFilamento(); break;
                case 2: mostrarFilamentos(); break;
                case 3: encargarPieza(); break;
            }
            op = menu();
        }
        guardarDatos();
    }
    }
    
}
