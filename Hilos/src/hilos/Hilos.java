/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos;

/**
 *
 * @author mateo
 */
public class Hilos extends Thread{
    public Hilos(String str){
        super(str);
    }
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i+""+getName());
            System.out.println("Termina Thread "+getName());
            
        }
    }
 
    public static void main(String[] args) {
      new Hilos("Pepe").start();
      new Hilos("Juan").start();
        System.out.println("Termina thread main");
    }
    
}
