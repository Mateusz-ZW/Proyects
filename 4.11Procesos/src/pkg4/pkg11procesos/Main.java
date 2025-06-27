/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg11procesos;

import java.io.*;
import java.net.*;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        MulticastSocket ms=new MulticastSocket();
        
        int puerto=12345;
        
        InetAddress grupo=InetAddress.getByName("255.0.0.1");
        String cad="";
        while(!cad.trim().equals("*")){
            System.out.println("Datos a enviar al grupo: ");
            cad=br.readLine();
            
            DatagramPacket paquete =new DatagramPacket(cad.getBytes(),cad.length(),grupo,puerto);
            
            ms.send(paquete);
        }
        ms.close();
        System.out.println("Socket cerrado.");
      
    }
    
}
