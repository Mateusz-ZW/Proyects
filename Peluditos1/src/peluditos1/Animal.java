/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluditos1;

/**
 *
 * @author mateo
 */
public abstract class Animal {
     
    protected int id;
    protected String nombre;
    protected int edad;
    protected boolean reservado;


    private static int contador = 1;
    
    public Animal(String n, int e)
    {
        id = contador++;
        nombre = n;
        edad = e;
        reservado = false;
    }

    public int getId() {
        return id;
    }

    public boolean isReservado() {
        return reservado;
    }
    
    public void reservar()
    {
        if (isReservado())
            System.out.println("El animal "+id+" ya se encontraba reservado");
        else
        {
            reservado = true;
            System.out.println("El animal "+id+" se ha reservado correctamente");
        }
    }
    
    public void anularReserva()
    {
        if (!isReservado())
            System.out.println("El animal "+id+" no está reservado");
        else
        {
            reservado = false;
            System.out.println("Se ha anulado la reserva correctamente");
        }
    }
    
    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Animal.contador = contador;
    }
    
    @Override
    public String toString()
    {
        return id+"\t"+nombre+"\t"+edad+" meses\t"+((reservado)?"Reservado":"No reservado");
    }
}
