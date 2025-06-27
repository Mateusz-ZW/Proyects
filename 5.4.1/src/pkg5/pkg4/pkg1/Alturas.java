/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.pkg4.pkg1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Alturas {
    private float[] alturas=new float[5];
    
    public Alturas(){
        
    }
    public Alturas(float a1,float a2,float a3,float a4,float a5 ){
        
    }
    public void cargar(){
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<alturas.length;i++){
            System.out.println("Dime la altura "+i+" :");
            alturas[i]=sc.nextFloat();
            
        }
    }
    public float calculaPromedio(){
        float sum=0;
        float media=0;
        for(int i=0;i<alturas.length;i++){
           sum+=alturas[i];
           media=(sum/alturas[i]);
        }
        
        return media;
    }
    public double mayoresPromedio(){
        float may=0;
        float promedio = calculaPromedio();
        for(int i=0;i<alturas.length;i++){
            if(alturas[i]>promedio){
                may++;
            }
        }
        return may;
        
            
        
    }
    public double menoresPromedio(){
        float men=0;  
        float promedio = calculaPromedio();
        for(int i=0;i<alturas.length;i++){
            if(alturas[i]<promedio){
                men++;
            }
        }
        return men;
    }
}
