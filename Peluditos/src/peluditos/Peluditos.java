/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peluditos;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Peluditos {

    /**
     * @param args the command line arguments
     */
     public static ArrayList <Animal>animal=new ArrayList<Animal>();
     public static final String F = "EjPeluditos.dat";
     public static int leerInt(){
         Scanner sc=new Scanner(System.in);
         while(true){
             try{
                 return sc.nextInt();
             }
             catch(Exception e){
                 System.out.println("Error");
                 sc.nextLine();
                 
             }
         }
     }
     public static int menu(){
         int op=0;
         while(op<1 || op>8 ){
             System.out.println("1. Añadir animal");
             System.out.println("2. Mostrar todos los animales");
             System.out.println("3. Mostrar listado de perros sin reserva");
             System.out.println("4. Mostrar listado de gatos sin reserva");
             System.out.println("5. Reservar");
             System.out.println("6. Anular reserva");
             System.out.println("7. Adoptar");
             System.out.println("8. Salir");
             op=leerInt();
         }
         return op;
     }
     public static void añadirAnimal(){
         Scanner sc=new Scanner(System.in);
         int op=0;
         
        while(op!=1 && op!=2){
            System.out.println("Que tipo de animal desea añadir?");
            op=leerInt();
            
        }
         System.out.println("Nombre: ");
         String nombre=sc.nextLine();
         System.out.println("Edad: ");
         int edad=sc.nextInt();
         if(op==1){
             animal.add(new Perro(nombre,edad));
         }
         else 
             animal.add(new Gato(nombre,edad));
         
     }
     public static void mostrarTodos(){
         Scanner sc= new Scanner(System.in);
         Iterator<Animal>it=animal.iterator();
         while(it.hasNext()){
             System.out.println(it.next());
             int op=0;
             while(op!=1 && op!=2){
                 System.out.println("Desea guardar el listado en un fichero?");
                 op=leerInt();
             }
             if(op==1){
                 System.out.println("Nombre del fichero es "+F);
                 BufferedWriter bw=null;
                 try{
                     bw=new BufferedWriter(new FileWriter(F));
                     it=animal.iterator();
                     while(it.hasNext()){
                         bw.write(it.next().toString());
                     }
                 }
                 catch(IOException e){
                     System.out.println("Error escribiendo el fichero");
                 }
                 finally{
                     try{
                         if (bw!=null){
                             bw.close();
                         }
                     }
                     catch(IOException e){
                         System.out.println("Error cerrando el fichero");
                         
                     }
                 }
                 
                 
             }
         }
     }
     public static void mostrarPerros(){
         Iterator <Animal>it=animal.iterator();
         while(it.hasNext()){
             Animal a=it.next();
             if(a instanceof Perro && !a.isReservado())
                 System.out.println(a);
         }
     }
      public static void mostrarGatos(){
         Iterator <Animal>it=animal.iterator();
         while(it.hasNext()){
             Animal a=it.next();
             if(a instanceof Gato && !a.isReservado())
                 System.out.println(a);
         }
     }
      public static Animal buscar(int id){
          Iterator <Animal> it=animal.iterator();
          while(it.hasNext()){
              Animal a=it.next();
              if(a.getId()==id){
                  return a;
              }
             
          }
           return null;
      }
      public static void reservar(){
          int id=leerInt();
          Animal a=buscar(id);
          if(a==null){
              System.out.println("No hay ningun animal con id "+id);
          }
          else
              a.reservar();
      }
      public static void anularReserva(){
          System.out.println("Identificador: ");
          int id=leerInt();
          Animal a=buscar(id);
          if(a==null){
              System.out.println("No hay ningun animal con id "+id);
          }
          else
              a.anularReserva();
      }
      public static void adoptar(){
          System.out.println("Identificador: ");
          int id=leerInt();
          Animal a=buscar(id);
          if(a==null){
              System.out.println("No hya ningun animal con id "+id);
          }
          else if(a.isReservado()){
              animal.remove(a);
              System.out.println("El animal con id"+id+"Ha sido adoptado");
          }
          else
              System.out.println("Para adoptar a un animal tiene que estar reservado");
      }
      public static void guardarDatos(){
          ObjectOutputStream oos=null;
          try{
              oos=new ObjectOutputStream(new FileOutputStream(F));
              oos.writeObject(animal);
              
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
          ObjectInputStream ois=null;
          try{
              ois=new ObjectInputStream(new FileInputStream(F));
              animal=(ArrayList<Animal>)ois.readObject();
              
          }
          catch(ClassNotFoundException e){
              System.out.println("error");
          }
          catch(FileNotFoundException e){
             
          }
          catch(Exception e){
              System.out.println("Error en los datos");
          }
          finally{
              try{
                  if(ois!=null){
                      ois.close();
                  }
                  
              }
              catch(Exception e){
                  System.out.println("Error cerrando el fichero");
              }
          }
      }
       
    public static void main(String[] args) {
      recuperarDatos();
      int op=menu();
      while(op!=8){
          switch(op){
              case 1: añadirAnimal();
              break;
              case 2: mostrarTodos();
              break;
              case 3: mostrarPerros();
              break;
              case 4: mostrarGatos();
              break;
              case 5: reservar();
              break;
              case 6: anularReserva();
              break;
              case 7: adoptar();
              break;
              
          }
          op=menu();
      }
      guardarDatos();
       
    }
    
}
