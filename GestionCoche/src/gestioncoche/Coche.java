/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncoche;

import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class Coche {
    private ArrayList<Coche>arr;
    private String marca;
    private String tipo;
    private String matricula;
    
    public Coche(){
        arr=new ArrayList();
    }
    public Coche(String matricula){
        this.matricula=matricula;
    }

    public Coche(String marca, String tipo, String matricula) {
        
        this.marca = marca;
        this.tipo = tipo;
        this.matricula = matricula;
    }
   
    
    public void añadirCoche(ArrayList arr){
        arr.add(new Coche(marca,tipo, matricula));
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String toString(){
        return "La marca es: "+this.marca+"\n el tipo es: "+this.tipo+"\n y su matricula es: "+this.matricula;
    }
    
}
