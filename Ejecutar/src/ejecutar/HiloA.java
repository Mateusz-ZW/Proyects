/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutar;

/**
 *
 * @author mateo
 */
public class HiloA extends Thread{
    private Contador c;
    
    public HiloA(String nombre,Contador c){
        setName(nombre);
        this.c=c;
    }
    public synchronized void run (){
        for(int j=0;j<300;j++){
            c.incrementar();
            try{
                sleep(10);
            }
            catch(InterruptedException e){}
    }
        System.out.println(getName()+" contador vale: "+c.getValor());
}
}
