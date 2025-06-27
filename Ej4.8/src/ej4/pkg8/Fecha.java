/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4.pkg8;

/**
 *
 * @author mateo
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    public Fecha(){}
    public Fecha(int dia,int mes,int anio){
        if(fechaCorrecta(dia,mes,anio)){
            this.dia=dia;
            this.mes=mes;
            this.anio=anio;
        }
        
    }
    public boolean fechaCorrecta(int dia,int mes,int anio){
    if(dia>0&&dia<32)
    return true;
    if(mes>0&&mes>12)
    return true;
    if(anio>0&&anio<9999)
    return true;
    
    else 
    return false;
}
    public void diaSiguiente(){
        if(fechaCorrecta(dia,mes,anio)){
            dia++;
            if(dia>31)
                dia=1;
                mes++;
            if(mes>12)
                mes=1;
                anio++;
                
                    
            
        }
    }
        public String toString(){
            if(dia<10&&mes<10){
            return "0"+dia+"-"+"0"+mes+anio;
            }
            else
            return dia+"-"+mes+"-"+anio;
            
        }
}
        
    


