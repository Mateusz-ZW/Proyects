/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg3proceso;

import java.io.IOException;
import java.net.*;
import java.io.*;

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
       Socket clienteConectado=null;
        System.out.println("Esperando al cliente....");
        clienteConectado=servidor.accept();
        
        InputStream entrada=null;
        entrada=clienteConectado.getInputStream();
        DataInputStream flujoEntrada=new DataInputStream(entrada);
        System.out.println("Recibiendo del CLIENTE: "+flujoEntrada.readUTF());
       
        OutputStream salida=clienteConectado.getOutputStream();
        DataOutputStream flujoSalida= new DataOutputStream(salida);
        
        flujoSalida.writeUTF("Saludos al cliente del servidor");
        entrada.close();
        flujoEntrada.close();
        salida.close();
        flujoSalida.close();
        clienteConectado.close();
        servidor.close();
    }
    
}
