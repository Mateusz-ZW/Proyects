/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productor.consumidor;

/**
 *
 * @author mateo
 */
public class Productor extends Thread {
      private int n;
      private Cola c;
    
    public Productor(Cola c,int n){
        this.c=c;
        this.n=n;
        
    }
    public void run(){
        
        for(int i=0;i<5;i++){
            c.put(i);
            System.out.println(i+" => Productor: "+n+ ", produce: "+i);
            try{
                sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
