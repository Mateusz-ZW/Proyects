/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg8procesos;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte[] bufer = new byte[1024]; // búfer para recibir el datagrama
        // ESPERANDO DATAGRAMA
        // ASOCIO EL SOCKET AL PUERTO 12345
        try (DatagramSocket socket = new DatagramSocket(12345)) {
            // ESPERANDO DATAGRAMA
            System.out.println("Esperando Datagrama .......... ");
            DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
            socket.receive(recibo); // recibo datagrama
            int bytesRec = recibo.getLength(); // obtengo número de bytes
            String paquete = new String(recibo.getData()); // obtengo String
            // VISUALIZO INFORMACIÓN
            System.out.println("Número de Bytes recibidos: " + bytesRec);
            System.out.println("Contenido del Paquete    : " + paquete.trim());
            System.out.println("Puerto origen del mensaje: " + recibo.getPort());
            System.out.println("IP de origen             : " +
                               recibo.getAddress().getHostAddress());
            System.out.println("Puerto destino del mensaje: " +
                               socket.getLocalPort());
            // cierro el socket
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
    

