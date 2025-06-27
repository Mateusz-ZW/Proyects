/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg6;

/**
 *
 * @author mateo
 */
public class EComision extends Empleado{
      private static final double salarioMinimo = 750;
    private int nClientes;
    private double montoCliente;
    
    public EComision()
    {}
    
    public EComision(String d, String n, String a, int i, int c, double m)
    {
        super(d,n,a,i);
        nClientes = c;
        montoCliente = m;
    }

    public int getnClientes() {
        return nClientes;
    }

    public void setnClientes(int nClientes) {
        this.nClientes = nClientes;
    }

    public double getMontoCliente() {
        return montoCliente;
    }

    public void setMontoCliente(double montoCliente) {
        this.montoCliente = montoCliente;
    }
    
    
    
    @Override
    public double obtenerSalario()
    {
        double salario = nClientes*montoCliente;
        if (salario < salarioMinimo)
            salario = salarioMinimo;
        return salario;
    }
    
    @Override
    public void imprimir()
    {
        System.out.println(nombre+" "+apellido+", DNI: "+dni+
                ", desde "+año+", "+nClientes+"clientes captados a "+montoCliente+
                "€ cada uno, Salario total: "+obtenerSalario()+"€");
    }
}
