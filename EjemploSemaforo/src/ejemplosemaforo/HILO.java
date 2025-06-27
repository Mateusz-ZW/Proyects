/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosemaforo;

import java.util.concurrent.Semaphore;

/**
 *
 * @author mateo
 */
public class HILO extends Thread{
    Semaphore sem;
    String nombreHilo;
    
    public HILO(Semaphore sem,String nombreHilo){
        super(nombreHilo);
        this.sem=sem;
        this.nombreHilo=nombreHilo;
    }
    public void run(){
        System.out.println(nombreHilo+" esperando un permiso");
        try{
            sem.acquire();
        }
        catch(InterruptedException e){
           e.printStackTrace();
        }
        System.out.println(nombreHilo+" obtiene un permiso");
        for(int i=0;i<2;i++){
            boolean b=sem.hasQueuedThreads();
            if(b){
                System.out.println("Longitud de cola: "+sem.getQueueLength());
                try{
                    sleep(10);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                    
                }
            }
        }
        System.out.println(nombreHilo+" libera permiso");
        sem.release();
    }
}
