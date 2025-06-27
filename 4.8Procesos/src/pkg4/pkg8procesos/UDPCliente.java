/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.pkg8procesos;

import java.net.*;
import java.io.*;

/**
 *
 * @author mateo
 */
public class UDPCliente {
     public static void main(String[] args) {
         try{
             DatagramSocket socket=new DatagramSocket(34567);
             InetAddress destino=InetAddress.getLocalHost();
             int port=12345;
             byte[] mensaje=new byte[1024];
             String saludo="Enviando Saludo!!";
             mensaje=saludo.getBytes();
             
             DatagramPacket envio=new DatagramPacket(mensaje,mensaje.length,destino,port);
            
             System.out.println("Enviando Datagrama de longitud: "+mensaje.length);
             System.out.println("Host destino: "+destino.getHostName());
             System.out.println("Ip destino: "+destino.getHostAddress());
             System.out.println("Puerto local del socket: "+socket.getLocalPort());
             System.out.println("Puerto al que envio: "+envio.getPort());
             
             socket.send(envio);
         }
         catch(Exception e){
             e.printStackTrace();
         }
     }
}
