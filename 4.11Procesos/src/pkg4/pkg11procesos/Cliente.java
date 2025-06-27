/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.pkg11procesos;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketAddress;

/**
 *
 * @author mateo
 */
public class Cliente {
    public static void main(String []args ) throws IOException{
       int puerto=12345;
       MulticastSocket ms=new MulticastSocket(puerto);
       
       InetAddress grupo=InetAddress.getByName("225.0.0.1");
       
       SocketAddress sockaddr=new InetSocketAddress(grupo,puerto);
       NetworkInterface netIf= NetworkInterface.getByInetAddress(InetAddress.getByName("DESKTOP-MRPJ6VC"));
       ms.joinGroup(sockaddr, netIf);
       String msg="";
       
       while(!msg.trim().equals("*")){
           byte[] buf=new byte[1000];
           
           DatagramPacket paquete =new DatagramPacket(buf,buf.length);
           ms.receive(paquete);
           msg=new String(paquete.getData());
           System.out.println("Recibo: "+msg.trim());
       }
       ms.leaveGroup(sockaddr, netIf);
       ms.close();
        System.out.println("Socket cerrado.");
       
       
    }
}
