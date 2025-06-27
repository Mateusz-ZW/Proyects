/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg7procesos;

import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          try {
            // Obtiene todas las interfaces de red
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

            while (interfaces.hasMoreElements()) {
                NetworkInterface networkInterface = interfaces.nextElement();

                // Obtiene el nombre y el índice de la interfaz
                String name = networkInterface.getName();
                int index = networkInterface.getIndex();

                // Muestra la información básica de la interfaz
                System.out.println("Nombre: " + name + "\tÍndice: " + index +
                                   "\tVirtual: " + networkInterface.isVirtual());

                getMac(networkInterface);

                // Obtiene las direcciones IP de la interfaz
                List<InterfaceAddress> interfaceAddresses = networkInterface.getInterfaceAddresses();

                for (int i = 0; i < interfaceAddresses.size(); i++) {
                    InterfaceAddress interfaceAddress = interfaceAddresses.get(i);
                    System.out.println("Dirección IP: " + interfaceAddress.getAddress());
                    System.out.println("\tDirección Broadcast: " + interfaceAddress.getBroadcast());
                    System.out.println("\tCIDR /: " + interfaceAddress.getNetworkPrefixLength());
                }
                System.out.println("------------------------------");
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public static void getMac(NetworkInterface networkInterface) throws SocketException {
        // Comprobar si tiene una dirección MAC (probablemente física)
        byte[] hardwareAddress = networkInterface.getHardwareAddress();

        if (hardwareAddress != null) {
            // Convierte la dirección MAC en un formato legible
            StringBuilder macAddress = new StringBuilder();
            for (int i = 0; i < hardwareAddress.length; i++) {
                macAddress.append(String.format("%02X", hardwareAddress[i]));
                if (i != hardwareAddress.length - 1) {
                    macAddress.append(":");
                }
            }
            System.out.println("Dirección MAC: " + macAddress.toString());
        } else {
            System.out.println("Dirección MAC: No tiene");
        }
    }
}
    
    

