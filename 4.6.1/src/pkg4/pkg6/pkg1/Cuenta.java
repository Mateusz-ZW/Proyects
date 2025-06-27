/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.pkg6.pkg1;

/**
 *
 * @author mateo
 */
public class Cuenta {
    private String nombre;
    private String numero;
    private double interes;
    private double saldo;
    
    public Cuenta(){
        
    }
    public Cuenta(String nombre, String numero,double interes,double saldo){
        nombre=this.nombre;
        numero=this.numero;
        interes=this.interes;
        saldo=this.saldo;
        
    }
    public Cuenta( Cuenta c){
        
        this.nombre=c.nombre;
        this.numero=c.numero;
        this.interes=c.interes;
        this.saldo=c.saldo;
        
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
    public boolean ingreso(double saldo){
        if(interes>=0){
            saldo+=interes;
            return true;
        }
        else{
            System.out.println("El saldo no puede ser negativo");
            return false;
        }
    }
    public boolean reintegro(double cant){
        if(cant>=0 || cant<=saldo){
            saldo-=interes;
            return true;
        }
        else{
            System.out.println("El saldo tiene que ser mayor a 0 y el interes tambien para poder retirar algo de dinero");
            return false;
        }
    }
    // Si transferencia devuelve un boolean
    public boolean transferencia(Cuenta c, double interes){
        return (this.reintegro(interes) && c.ingreso(interes));
    }
   // Si transferencia no devuelve nada
    public void transferencia2(Cuenta c, double i)
    {
        if (this.reintegro(i))
            c.ingreso(i);
    }
}
