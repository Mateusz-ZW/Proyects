/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author mateo
 */
public class Cuenta {
    private String nombre;
    private String numero;
    private double interes;
    private double saldo;
    public Cuenta(){}
    public Cuenta(String nombre, String numero, double interes, double saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.interes = interes;
        this.saldo = saldo;
    }
     public Cuenta(Cuenta c,String nombre, String numero, double interes, double saldo) {
        c.nombre = nombre;
        c.numero = numero;
        c.interes = interes;
        c.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
     public boolean ingreso(double cant){
         if(cant<0){
             return false;
             
         }
         else{
             saldo+=cant;
             return true;
         }
             
         
     }
     public boolean reintegro(double cant){
         if(cant>0 && cant<saldo){
             saldo-=cant;
             return true;
         }
         else{
             return false;
             
         }
     }
     public boolean transferencia(Cuenta c,double i){
          
        return (this.reintegro(i) && c.ingreso(i));            
     }
    // Si transferencia no devuelve nada
    public void transferencia2(Cuenta c, double i)
    {
        if (this.reintegro(i))
            c.ingreso(i);
    }
    
     }
         
         
    
    
}
