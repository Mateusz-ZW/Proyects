/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluditos;

import java.io.*;

/**
 *
 * @author mateo
 */
public class Animal implements Serializable {
    private int id;
    private String nombre;
    private int edad;
    private boolean reservado;
    private static int cont=1;
    public Animal(){
        
    }
    public Animal(String nombre,int edad){
        id=cont++;
        this.nombre=nombre;
        this.edad=edad;
        reservado=false;
    }
    public boolean isReservado(boolean reservado){
        return reservado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
    public void reservar(){
        if(isReservado()){
            System.out.println("El animal "+id+"ya estaba reservado");
        }
        else
            reservado=true;
        System.out.println("El animal "+id+"acaba de ser reservado");
    }
    public void anularReserva(){
        if(!isReservado()){
            System.out.println("El animal "+id+"no esta reservado");
        }
        else
            reservado=false;
        System.out.println("El animal "+id+"si esta reservado reservado");
    }
    public String toString(){
        return "El animal con el identificador: "+id+"de nombre"+nombre+"con edad: "+edad+((reservado)?"Reservado":"No reservado");
    }
}
