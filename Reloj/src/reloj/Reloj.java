/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reloj;

/**
 *
 * @author mateo
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reloj extends JFrame {
  private Thread h1, h2;
    private long tiempoJugador1 = 180000; // 3 minutos
    private long tiempoJugador2 = 180000; // 3 minutos
    private boolean enJuego = true;

    private void cuentaRegresivaJugador1() {
        while (tiempoJugador1 > 0 && enJuego) {
            try {
                Thread.sleep(1000);
                tiempoJugador1 -= 1000;
                SwingUtilities.invokeLater(() -> jLabel1.setText("Jugador 1: " + formatearTiempo(tiempoJugador1)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (tiempoJugador1 <= 0) {
            enJuego = false;
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            System.out.println("Jugador 2 ha ganado");
        }
    }

    private void cuentaRegresivaJugador2() {
        while (tiempoJugador2 > 0 && enJuego) {
            try {
                Thread.sleep(1000);
                tiempoJugador2 -= 1000;
                SwingUtilities.invokeLater(() -> jLabel2.setText("Jugador 2: "+formatearTiempo(tiempoJugador2)));
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                
            }
        }
    }
}