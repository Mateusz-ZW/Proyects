/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baneuro;

/**
 *
 * @author mateo
 */
public class CCorriente extends Cuenta{

   public CCorriente(String n, String a, String entidad, String oficina, double saldo)
    {
        super(n, a, entidad, oficina, saldo);
    }
     @Override
    public boolean ingresar(double cant) {
        saldo+=cant;
        return true;
    }

    @Override
    public boolean retirar(double cant) {
        if (saldo >= cant)
        {
            saldo-=cant;
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "Cuenta: "+cuenta+"\nCliente: "+nombre+" "+apellido+"\nSaldo: "+saldo+"€";
    }
    
}
