/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg6;

/**
 *
 * @author mateo
 */
public class Main {

      public static void sueldoMayor(Empleado[] e)
    {
        double mayor = 0;
        Empleado emp = null;
        for (int i = 0; i < e.length; i++)
        {
            if (e[i].obtenerSalario()>mayor)
            {
                emp = e[i];
                mayor = e[i].obtenerSalario();
            }
        }
        
        System.out.println("El empleado que más cobra es\n"
                + emp.getNombre()+" "+emp.getApellido()+" Salario: "+emp.obtenerSalario());
    }
    
    public static void mostrarTodos(Empleado[] e)
    {
        for (int i = 0; i < e.length; i++)
        {
            e[i].imprimir();
        }
    }
    public static void main(String[] args) {
        EFijo ea1 = new EFijo("Javier", "Gómez","569587A",2008, 1225);
        EComision ec1 = new EComision("Eva", "Nieto", "695235B",2010,179,8.1);
        EFijo ea2 = new EFijo();
        EComision ec2 = new EComision();
        ec2.setNombre("José");
        ec2.setApellido("Ruiz");
        ec2.setDni("741258C");
        ec2.setAño(2012);
        ec2.setnClientes(81);
        ec2.setMontoCliente(7.9);
        
        ea2.setNombre("María");
        ea2.setApellido("Núñez");
        ea2.setDni("896325D");
        ea2.setAño(2013);
        ea2.setSueldo(1155);
        
        Empleado[] empleados = {ea1,ec1,ec2,ea2};
        
        sueldoMayor(empleados);
        mostrarTodos(empleados);
    }
    
}
