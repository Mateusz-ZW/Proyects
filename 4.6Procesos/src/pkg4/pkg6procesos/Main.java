/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg6procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       int puerto=6000;
       ServerSocket servidor=new ServerSocket(puerto);
       String cad="";
       
        System.out.println("Esperando conexion....");
        Socket clienteConectado=servidor.accept();
        System.out.println("Cliente conectado....");
        
        PrintWriter fsalida=new PrintWriter(clienteConectado.getOutputStream(),true);
        BufferedReader fentrada=new BufferedReader(new InputStreamReader(clienteConectado.getInputStream()));
        
        while((cad=fentrada.readLine())!=null){
            fsalida.println(cad);
            System.out.println("Recibiendo: "+cad);
            if(cad.equals("*")) break;
            
        }
        System.out.println("Cerrando conexion....");
        fentrada.close();
        fsalida.close();
        clienteConectado.close();
        servidor.close();
    }
    
}
