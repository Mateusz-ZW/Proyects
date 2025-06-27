/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baneuro;

/**
 *
 * @author mateo
 */
public class CAhorro extends Cuenta{
 public CAhorro(String n, String a, String entidad, String oficina, double saldo)
    {
        super(n, a, entidad, oficina, saldo);
    }
    
    @Override
    public boolean ingresar(double cant) {
        if (cant%50==0)
        {
            saldo+=cant;
            return true;
        }
        return false;
    }

    @Override
    public boolean retirar(double cant) {
        if (saldo >= cant && cant%200==0)
        {
            saldo-=cant;
            return true;
        }
        else
            return false;
    }

    private int interes()
    {
        if (saldo < 1000) return 1;
        if (saldo < 10000) return 3;
        return 5;
    }
    
    @Override
    public String toString() {
        return "Cuenta: "+cuenta+"\nCliente: "+nombre+" "+apellido+"\nSaldo: "+saldo+"€"+
                "\nInterés: "+interes()+"%";
    }
    
}
