/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package relojajedrez;

/**
 *
 * @author mateo
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class relojAjedrez1 extends javax.swing.JFrame {
Thread h1,h2;
boolean turnoJugador1 = true;
boolean turnoJugador2=true;
boolean enJuego = true;
boolean pausadoJugador1 = true;
boolean pausadoJugador2 = true;
int tiempoJugador1=180000;
int tiempoJugador2=180000;

private void cuentaRegresivaJugador1() {
   
    int tiempoJugador1=180000;
    
    
        while (tiempoJugador1 > 0 && enJuego) {
            if (!pausadoJugador1){
        
            try {
                Thread.sleep(1000);
                tiempoJugador1 -= 1000;
                jLabel1.setText("Jugador 1: " + formatearTiempo(tiempoJugador1));
               
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        if (tiempoJugador1 <= 0) {
            enJuego = false;
            System.out.println("Jugador 2 ha ganado");
            
           
        
            }
    }
}
    private void cuentaRegresivaJugador2() {
       
    long tiempoJugador2=180000;
        while (tiempoJugador2 > 0 && enJuego) {
            if (!pausadoJugador2){
        
            try {
                Thread.sleep(1000);
                tiempoJugador2 -= 1000;
                jLabel2.setText("Jugador 2: " + formatearTiempo(tiempoJugador2));
              
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        
        if (tiempoJugador2 <= 0) {
            enJuego = false;
            System.out.println("Jugador 1 ha ganado");
               
        
    }
   }
 }

  
 private String formatearTiempo(long tiempo) {
        long minutos = (tiempo / 1000) / 60;
        long segundos = (tiempo / 1000) % 60;
        return String.format("%02d:%02d", minutos, segundos);
    }


    public relojAjedrez1() {
        initComponents();
        
        h1=new Thread(() ->cuentaRegresivaJugador1());
        h2=new Thread(() ->cuentaRegresivaJugador2());
    
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("00:00");

        jLabel2.setText("00:00");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(115, 115, 115))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

         
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        if (enJuego) {
            pausadoJugador1=  !pausadoJugador1;
        if (!pausadoJugador1) {
                pausadoJugador2 = true;
                   
                    jButton1.setEnabled(false);
                    jButton2.setEnabled(true);
                    
                    new Thread(() -> cuentaRegresivaJugador1()).start();
        }
    
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if (enJuego) {
            pausadoJugador2 = !pausadoJugador2; 
                    if (!pausadoJugador2) {
                pausadoJugador1 =true; 
                    
                    
                    jButton1.setEnabled(true);
                    jButton2.setEnabled(false);
              
                    new Thread(() -> cuentaRegresivaJugador2()).start();
                   
                 
         }  
        
    }//GEN-LAST:event_jButton2ActionPerformed
   
    }
    
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new relojAjedrez1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
