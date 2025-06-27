/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarios1;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Binarios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Dime el nombre del fichero binario Origen: ");
        String Origen=sc.nextLine();
        System.out.println("Dime el fichero binario Destino: ");
        String Destino=sc.nextLine();
        File fO=null;
        File fD=null;
        FileInputStream fis=null;
        FileOutputStream fos=null;
        
        try{
             fO=new File(Origen);
             fD=new File(Destino);
             fis=new FileInputStream(fO);
             fos=new FileOutputStream(fD);
            
            int datoByte;
            
            while((datoByte=fis.read())!=-1){
                fos.write(datoByte);
                
            }
            
        }
        catch(FileNotFoundException e){
            System.out.println("Error no se encontro el archivo");
        }
        catch(IOException e){
            System.out.println("Error de Entrada/Salida");
        }
        finally{
            try{
           fis.close();
           fos.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
       
        
    }
    
}
