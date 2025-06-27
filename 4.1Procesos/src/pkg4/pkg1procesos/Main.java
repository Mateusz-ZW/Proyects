/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg1procesos;

import java.net.*;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InetAddress ia=null;
        System.out.println("==============================");
        System.out.println("SALIDA PARA LOCALHOST: ");
        try{
            ia=InetAddress.getByName("DESKTOP-MRPJ6VC");
            pruebaMetodos(ia);
            
            System.out.println("=============================");
            System.out.println("SALIDA PARA UNA URL: ");
            ia=InetAddress.getByName("www.google.es");
            pruebaMetodos(ia);
            
            System.out.println("\tDIRECCIONES IP PARA: "+ia.getHostName());
            
            InetAddress[] direcciones=InetAddress.getAllByName(ia.getHostName());
            for(int i=0;i>direcciones.length;i++){
                System.out.println("\t\t"+direcciones[i].toString());
            }
            System.out.println("====================================");
            
            
        }
        catch(UnknownHostException e){
            e.printStackTrace();
        }
        
      
        
        
    }
    public static void pruebaMetodos(InetAddress ia){
        System.out.println("\tMetodo getByName(): "+ia);
        InetAddress ia2;
        try{
            ia2=InetAddress.getLocalHost();
            System.out.println("\tMetodo getLocalHost(): "+ia2);
        }
        catch(UnknownHostException e){
            e.printStackTrace();
        }
           
        System.out.println("\tMetodo getHostName(): "+ia.getHostName());
        System.out.println("\tMetodo getHostAddress(): "+ia.getHostAddress());
        System.out.println("\tMetodo toString(): "+ia.toString());
        System.out.println("\tMetodo getCanonicalHostName(): "+ia.getCanonicalHostName());
        
    }
       

}
