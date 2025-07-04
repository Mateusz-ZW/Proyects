/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg12procesos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.net.SocketException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author mateo
 */
public class Main extends JFrame implements ActionListener, Runnable {

    /**
     * @param args the command line arguments
     */
     private static final long serialVersionUID = 1L;
    static MulticastSocket ms = null;
    static byte[] buf = new byte[1000];
    static InetAddress grupo = null;
    static int puerto = 12345;// Puerto multicast

    static JTextField mensaje = new JTextField();
    private JScrollPane scrollpane1;
    static JTextArea textarea1;

    JButton boton = new JButton("Enviar");
    JButton desconectar = new JButton("Salir");
    boolean repetir = true;
    String nombre;

    // constructor
    public Main(String nom) {
        super(" VENTANA DE CHAT UDP - Nick: " + nom);
        setLayout(null);
        this.nombre = nom;
        mensaje.setBounds(10, 10, 400, 30); add(mensaje);
        textarea1 = new JTextArea();
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10, 50, 400, 300);
        add(scrollpane1);
        boton.setBounds(420, 10, 100, 30);     add(boton);
        desconectar.setBounds(420, 50, 100, 30);
        add(desconectar);
        textarea1.setEditable(false);
        boton.addActionListener(this);
        desconectar.addActionListener(this);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }// fin constructor

    // accion cuando pulsamos botones
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) { // SE PULSA EL ENVIAR
            String texto = nombre + ">> " + mensaje.getText();            
            try {
                // ENVIANDO mensaje al grupo
                DatagramPacket paquete = new DatagramPacket(texto.getBytes(),
                                texto.length(), grupo, puerto);
                ms.send(paquete);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        
        if (e.getSource() == desconectar) { // SE PULSA DESCONECTAR
            String texto = "*** Abandona el chat: " + nombre + " ***";            
            try {
                // ENVIANDO DESPEDIDA AL GRUPO
                DatagramPacket paquete = new DatagramPacket(texto.getBytes(),
                                texto.length(), grupo, puerto);
                ms.send(paquete);
                ms.close();
                repetir = false;
                System.out.println("Abandona el chat: "+ nombre);
                System.exit(0);

            } catch (IOException e1) {
                    e1.printStackTrace();
            }
        }
    }//

    // DESDE EL MÉTODO RUN SE RECIBEN LOS MENSAJES
    //Y SE PINTAN EN LA PANTALLA
    public void run() {    
     while (repetir) {
        try {
            DatagramPacket p = new DatagramPacket(buf, buf.length);
            ms.receive(p);
            String texto = new String(p.getData(), 0, p.getLength());
            textarea1.append(texto + "\n");
        }catch (SocketException s) {
            System.out.println(s.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }     
    }// run

    public static void main(String args[]) throws IOException {
        String nombre = JOptionPane
                        .showInputDialog("Introduce tu nombre o nick:");
        // Se crea el socket multicast
        ms = new MulticastSocket(puerto);
        grupo = InetAddress.getByName("225.0.0.1");// Grupo
        // Nos unimos al grupo

        SocketAddress sockaddr = new InetSocketAddress(grupo, puerto);
        NetworkInterface netIf = NetworkInterface.getByInetAddress(
                InetAddress.getByName("192.168.80.196"));

        ms.joinGroup(sockaddr, netIf);
        //ms.joinGroup(grupo);
        if (!nombre.trim().equals("")) {
            Main server = new Main(nombre);
            server.setBounds(0, 0, 540, 400);
            server.setVisible(true);
            new Thread(server).start();

        } else {
            System.out.println("El nombre está vacío....");
        }
    }// main
}
    

