/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.pkg2procesos;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author mateo
 */
public class Cliente {
    public static void main(String [] args) throws IOException{
        String host="localhost";
        int puerto=6000;
        Socket Cliente=new Socket(host,puerto);
        
        InetAddress ia=Cliente.getInetAddress();
        System.out.println("Puerto local: "+Cliente.getLocalPort());
        System.out.println("Puerto remoto: "+Cliente.getPort());
        System.out.println("Host remoto: "+ia.getHostName().toString());
        System.out.println("IP Host Remoto: "+ia.getHostAddress().toString());
        Cliente.close();
    }
}
