/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productor.consumidor;

/**
 *
 * @author mateo
 */
public class Consumidor extends Thread{
    private Cola c;
    private int n;
    
    public Consumidor(Cola c,int n){
        this.c=c;
        this.n=n;
        
    }
    public void run(){
        int valor=0;
        for(int i=0;i<5;i++){
            valor=c.get();
            System.out.println(i+" => Consumidor: "+n+ ", consume: "+valor);
        }
    }
}
