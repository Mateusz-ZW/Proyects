/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg2procesos;

import java.io.IOException;
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
        int puerto=6000;
        try{
        ServerSocket servidor=new ServerSocket(puerto);
            System.out.println("Escuchando en "+servidor.getLocalPort());
            Socket cliente1=servidor.accept();
            Socket cliente2=servidor.accept();
            servidor.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
