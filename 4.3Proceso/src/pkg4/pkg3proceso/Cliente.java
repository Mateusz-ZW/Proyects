/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.pkg3proceso;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author mateo
 */
public class Cliente {
    public static void main(String []args) throws IOException{
        String host="localhost";
        int puerto=6000;
        Socket cliente =new Socket(host,puerto);
        DataOutputStream dos=new DataOutputStream(cliente.getOutputStream());
        
        dos.writeUTF("Saludos al SERVIDOR DESDE EL CLIENTE");
        
        DataInputStream dis=new DataInputStream(cliente.getInputStream());
        System.out.println("Recibiendo del SERVIDOR: "+dis.readUTF());
        
        dos.close();
        dis.close();
        cliente.close();
        
        
    }
}
