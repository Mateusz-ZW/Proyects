/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionreparaciones;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;


public class GestionReparaciones {

    public static ArrayList<Trabajo>trabajos=new ArrayList();
    public static String nFichero="trabajos.dat";
    
    public static int menu(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op>7){
            System.out.println("1.Nuevo trabajo");
            System.out.println("2.Añadir Horas");
            System.out.println("3.Añadir material");
            System.out.println("4.Finalizar trabajo y generar factura");
            System.out.println("5.Eliminar trabajo");
            System.out.println("6.Listar trabajos");
            System.out.println("7.Salir");
            op=sc.nextInt();
            
        }
        return op;
    }
    public static int menuNuevo(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op > 3){
            System.out.println("1.Revision");
            System.out.println("2.Reparacion Mecanica");
            System.out.println("3.Reparacion chapa y pintura");
            op=sc.nextInt();
            
        }
        return op;
    }
    public static void nuevoTrabajo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Seleccione el tipo de trabajo: ");
        int tipo=menuNuevo();
        Trabajo t=null;
        System.out.println("Escribe la descripcion: ");
        String desc=sc.nextLine();
        switch(tipo){
            case 1: t=new Revisiones(desc);
            break;
            case 2: t=new RMecanica(desc);
            break;
            case 3: t=new RChapaYpintura(desc);
            break;
            
        }
        trabajos.add(t);
    }
    public static int buscar(String id){
        for(int i=0;i<trabajos.size();i++){
            if(trabajos.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    public static void añadirHoras(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique el codigo del trabajo: ");
        String id=sc.nextLine();
        System.out.println("Dime el numero de horas: ");
        int horas=sc.nextInt();
        int pos=buscar(id);
        if(pos==-1){
            System.out.println("No se ha encontrado el trabajo");
        }
        else{
            trabajos.get(pos).incrementarHoras(horas);
            
        }
    }
    public static void añadirMaterial(){
       Scanner sc=new Scanner(System.in);
    
       System.out.println("Indique el codigo del trabajo: ");
       String id=sc.nextLine();
        System.out.println("Indique el precio del material: ");
        double precio=sc.nextDouble();
        int pos=buscar(id);
        if(pos==-1){
            System.out.println("Trabajo no encontrado");
        }
        else{
            if(trabajos.get(pos) instanceof Reparaciones){
                ((Reparaciones)trabajos.get(pos)).usarMaterial(precio);
            }
            else{
                System.out.println("No se una reparacion");
            }
        }
    }
    public static void finalizarTrabajo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("indique el codigo el trabajo: ");
        String id=sc.nextLine();
        int pos=buscar(id);
        if(pos==-1){
            System.out.println("No se ha encontrado el trabajo");
        }
        else{
            Trabajo t=trabajos.get(pos);
            t.finalizar();
            String nFactura=t.getId()+" .FAC";
            BufferedWriter bw=null;
            try{
                bw=new BufferedWriter(new FileWriter(nFactura));
                bw.write(t.toString());
            }
            catch(IOException e){
                e.printStackTrace();            
            }
            finally{
                try{
                       if (bw!=null){
                           bw.close();
                       }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                }
        }
        
    }
    public static void eliminarTrabajo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique el codigo del trabajo: ");
        String id=sc.nextLine();
        int pos=buscar(id);
        if(pos==-1){
            System.out.println("Trabajo no encontrado");
        }
        else{
            trabajos.remove(pos);
        }
    }
    public static void listarTrabajos(){
        for(int i=0;i<trabajos.size();i++){
            System.out.println(trabajos.get(i));
        }
    }
    public static void cargarFichero(){
        File f=new File(nFichero);
        if(f.exists()){
            ObjectInputStream ois=null;
            try{
                ois=new ObjectInputStream(new FileInputStream(f));
                trabajos=(ArrayList<Trabajo>)ois.readObject();
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
           oos.writeObject(trabajos);
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
        while(op!=7){
            switch(op){
                case 1: nuevoTrabajo();
                break;
                case 2: añadirHoras();
                break;
                case 3: añadirMaterial();
                break;
                case 4: finalizarTrabajo();
                break;
                case 5: eliminarTrabajo();
                break;
                case 6: listarTrabajos();
                break;
            }
            op=menu();
        }
        guardarFichero();
    }
    
}
