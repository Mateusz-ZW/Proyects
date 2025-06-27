/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajerohilos;

import static java.lang.Thread.sleep;

/**
 *
 * @author mateo
 */
public class Cuenta {
    private int saldo;
    
    public Cuenta(int s){
        saldo=s;
    }
     public int getSaldo(){
        return saldo;
    }
    public void restar(int cantidad){
        saldo-=cantidad;
    }
    public synchronized void retirarDinero(int cant, String nombre){
        if(getSaldo()>=cant){
            System.out.println("SE VA A RETIRAR SALDO (ACTUAL ES: "+getSaldo()+")");
            try{
                sleep(500);
            }
            catch(InterruptedException e){
            
            }
           
                restar(cant);
                System.out.println(nombre+" retira => "+cant+ "ACTUAL("+getSaldo()+")");
        }
        else{
           System.out.println(nombre+" no puede retirar dinero, NO HAY SALDO ("+getSaldo()+")");
        }
        if(getSaldo()<0){
            System.out.println("SALDO NEGATIVO => "+getSaldo());
        }
        
    }
}
