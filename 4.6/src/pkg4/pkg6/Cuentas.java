/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.pkg6;

/**
 *
 * @author mateo
 */
public class Cuentas {
    private String nombre;
    private String ncuenta;
    private double interes;
    private double saldo;

    public Cuentas() {
    }
    public Cuentas(Cuentas c){
        nombre=c.nombre;
        ncuenta=c.ncuenta;
        interes=c.interes;
        saldo=c.saldo;
    }
    
    public Cuentas(String nombre, String ncuenta, double interes, double saldo) {
        this.nombre = nombre;
        this.ncuenta = ncuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
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
        if(cant>=0){
            saldo+=cant;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean reitegro(double cant){
        if(saldo>0){
            saldo-=cant;
            return true;
        }
        else{
            return false;
        }
    }
      public boolean transferencia(Cuentas c, double i)
    {
        return (this.reintegro(i) && c.ingreso(i));            
    }
    // Si transferencia no devuelve nada
    public void transferencia2(Cuentas c, double i)
    {
        if (this.reintegro(i))
            c.ingreso(i);
    }
    
    
}
