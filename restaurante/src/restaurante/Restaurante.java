/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    
    public static ArrayList<Reserva> reservas=new ArrayList();
    public static final String F="reserva.bin";
    public static Scanner sc =new Scanner(System.in);
    
    public static int menu(){
        int op=0;
        while(1<op || op>5){
            System.out.println("1.Añadir reserva");
            System.out.println("2.Mostrar todas las reservas");
            System.out.println("3.Mostrar listado de las reservas con catering");
            System.out.println("Anular reserva");
            System.out.println("5.Salir");
            op=sc.nextInt();
        }
        return op;
        
    }
    public static Reserva buscar(int id){
        Iterator<Reserva> it=reservas.iterator();
        while(it.hasNext()){
            Reserva r=it.next();
            if(r.getID()==id){
                return r;
            }
        }
        return null;
        
    }
    public static void añadirReserva(){
        int op=0;
        while(1!=1 && op!=2){
            System.out.println("Indica el tipo de reserva: ");
            System.out.println("1.Solo local");
            System.out.println("2.Con catering y barra libre");
            op=sc.nextInt();
    }
        System.out.println("Año: ");
        int a=sc.nextInt();
        int s=0;
        while(!Reserva.semanaValida(s)){
            System.out.println("Semana: ");
            s=sc.nextInt();
            
        }
        Reserva r=buscar(Reserva.generarId(a, s));
        if(r==null){
            System.out.println("Cliente: ");
            String cliente=sc.nextLine();
            if(op==1){
                reservas.add(new ReservaLocal(a,s,cliente));
            }
                
                else
                {
                     int p=0;
                     while(!ReservaCatering.validoNPersonas(p)){
                         System.out.println("Numero de personas: ");
                         p=sc.nextInt();
                         
                        
                }
                     System.out.println("Numero de horas: ");
                     int h=sc.nextInt();
                     reservas.add(new ReservaCatering(a,s,cliente,p,h));
            }
        }
        else
            System.out.println("Esa fecha no esta disponible");
    }
    public static void volcarListado(){
        System.out.println("Indica el nombre del fichero: ");
        String f=sc.nextLine();
        BufferedWriter bw=null;
        try{
            bw=new BufferedWriter(new FileWriter(f));
            Iterator<Reserva>it=reservas.iterator();
            while(it.hasNext()){
                bw.write(it.next().toString());
            }
        }
        catch(IOException e){
            System.out.println("Error escribiendo en el fichero");
    }
        finally{
            try{
                if(bw!=null){
                    bw.close();
                }
            }
            catch(IOException e){
                System.out.println("Error cerrando el fichero");
            }
        }
    }
    public static void mostrarReservas(){
        Iterator <Reserva> it =reservas.iterator();
        while(it.hasNext()){
        System.out.println(it.next());
    }
        int op=0;
        while(op!=1 && op!=2){
            System.out.println("Desea volcar el listado en un fichero?");
            System.out.println("1.Si");
            System.out.println("2.No");
            op=sc.nextInt();
        }
        if(op==1){
            volcarListado();
        }
        
    }
    public static void mostrarReservasCatering(){
        Iterator<Reserva> it=reservas.iterator();
        while(it.hasNext()){
            Reserva r=it.next();
            if(r instanceof ReservaCatering){
                System.out.println(r);
            }
        }
    }
    public static void anularReserva(){
        System.out.println("Año: ");
        int a =sc.nextInt();
        int s=0;
        while(!Reserva.semanaValida(s)){
            System.out.println("Semana: ");
            s=sc.nextInt();
           
        }
        Reserva r =buscar(Reserva.generarId(a, s));
        if(r!=null){
            reservas.remove(r);
            System.out.println("Reserva anulada correctamente");
            
        }
        else
            
            System.out.println("No existe ninguna reserva en esa fecha");
    }
    public static void guardarDatos(){
        ObjectOutputStream oos=null;
        try{
            oos=new ObjectOutputStream(new FileOutputStream(F));
            oos.writeObject(reservas);
        }
        catch(IOException e){
            System.out.println("Error guardando los datos");
        }
        finally{
            try{
                if(oos!=null){
                    oos.close();
                }
               
                    
            }
            catch(IOException e){
                System.out.println("Error cerrando el fichero");
            }
        }
    }
    public static void recuperarDatos(){
        ObjectInputStream ois=null;
        try{
            ois=new ObjectInputStream(new FileInputStream(F));
            reservas=(ArrayList<Reserva>)ois.readObject();
        }
        catch (FileNotFoundException e){}
        catch (ClassNotFoundException e)
        {
            System.out.println("Error en los datos");
        }
        catch (IOException e)
        {
            System.out.println("Error leyendo los datos");
        }
        catch (Exception e)
        {
            System.out.println("Error en los datos");
        }
    }
    
    public static void main(String[] args) {
      recuperarDatos();
      int op=menu();
      while(op!=5){
          switch(op){
              case 1: añadirReserva();
              break;
              case 2: mostrarReservas();
              break;
              case 3: mostrarReservasCatering();
              break;
              case 4: anularReserva();
              break;
              
          }
          op=menu();
      }
      guardarDatos();
    }
    
}
