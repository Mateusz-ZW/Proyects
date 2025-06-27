/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.pkg11;

import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> p=new ArrayList();
        
        p.add(new Persona("Juan", 25));
        p.add(new Persona("Mateo",21));
        ObjectOutputStream oos=null;
        try{
             oos = new ObjectOutputStream(new FileOutputStream("C:\\IES-VIRGENDELAPAZ\\salida.obj"));
             oos.writeObject(p);
        }
        catch(IOException e){
            System.out.println("Error escribiendo en el fichero"+e.getMessage());
            System.err.println(e.getMessage());
        }
        finally{
            try{
                if(oos!=null){
                    oos.close();
                }
            }
            catch(IOException e){
                System.out.println("Error escribiendo en el fichero"+e.getMessage());
            }
        }
        ObjectInputStream ois=null;
        try{
            ois=new ObjectInputStream(new FileInputStream("C:\\IES-VIRGENDELAPAZ\\salida.obj"));
            ArrayList<Persona> p2= (ArrayList<Persona>)ois.readObject();
            System.out.println(p2);
            
        }
        catch(ClassNotFoundException e){
             System.out.println("Información errónea en el fichero"+e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("Error leyendo el fichero"+e.getMessage());
        }
        catch (Exception e)
        {
            
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
        }
    
    

