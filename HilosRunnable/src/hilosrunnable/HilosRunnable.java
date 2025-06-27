/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilosrunnable;

/**
 *
 * @author mateo
 */
public class HilosRunnable implements Runnable{

    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i+""+Thread.currentThread().getName());
            System.out.println("Termina thread " +Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        HilosRunnable ejemplo=new HilosRunnable();
        Thread h1=new Thread(ejemplo,"Pepe");
        Thread h2=new Thread(ejemplo,"Juan");
        h1.start();
        h2.start();
        System.out.println("Termina thread main");
    }
    
}
