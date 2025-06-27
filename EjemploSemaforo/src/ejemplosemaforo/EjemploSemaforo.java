/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosemaforo;

import java.util.concurrent.Semaphore;

/**
 *
 * @author mateo
 */
public class EjemploSemaforo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       Semaphore sem=new Semaphore(3,true);
        System.out.println("Imparciabilidad habilitada: "+sem.isFair());
        sem.tryAcquire(2);
        System.out.println("Permisos disponibles: "+sem.availablePermits());
        System.out.println("Nº permisos vaciados por el Hilo main: "+sem.drainPermits());
        sem.release(1);
        HILO H1=new HILO(sem,"A");
        HILO H2=new HILO(sem,"B");
        HILO H3=new HILO(sem,"C");
        
        H1.start();
        H2.start();
        H3.start();
        System.out.println(sem.toString());
        H1.join();
        H2.join();
        H3.join();
    }
    
}
