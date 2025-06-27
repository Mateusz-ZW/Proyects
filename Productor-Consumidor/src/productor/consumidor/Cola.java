/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productor.consumidor;

/**
 *
 * @author mateo
 */
public class Cola {
    private int numero;
    private boolean disponible=false;
    
   public synchronized int get(){
      while(disponible==false){
          try{
              wait();
          }
          catch(InterruptedException e){
              
          }
       }
      disponible=false;
      notifyAll();
      return numero;
       
   }
   public synchronized void put(int valor){
        while(disponible==true){
          try{
              wait();
          }
          catch(InterruptedException e){
              
          }
       }
       numero=valor;
       disponible=true;
       notifyAll();
   }
}
