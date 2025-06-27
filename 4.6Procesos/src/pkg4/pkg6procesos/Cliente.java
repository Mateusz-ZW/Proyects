/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.pkg6procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author mateo
 */
public class Cliente {
    public static void main(String []args) throws IOException{
        String host="localhost";
        int puerto=6000;
        Socket Cliente=new Socket(host,puerto);
        
        PrintWriter fsalida=new PrintWriter(Cliente.getOutputStream(),true);
        BufferedReader fentrada=new BufferedReader(new InputStreamReader(Cliente.getInputStream()));
        
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        
        String cadena, eco="";
        System.out.println("Introduce cadena: ");
        cadena=in.readLine();
        while(cadena!=null){
            fsalida.println(cadena);
            eco=fentrada.readLine();
            System.out.println(" =>ECO: "+eco);
            System.out.println("Introduce cadena: ");
            cadena=in.readLine();
            
        }
        fsalida.close();
        fentrada.close();
        System.out.println("Fin del envio...");
        in.close();
        Cliente.close();
        
        
        
    }
}
