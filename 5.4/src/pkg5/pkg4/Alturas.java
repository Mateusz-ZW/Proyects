/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.pkg4;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Alturas {
    float[]array;
    public Alturas(){
    float[]array=new float[5];
    }
    public Alturas(float a1,float a2,float a3,float a4,float a5){
    array=new float[]{a1,a2,a3,a4,a5};
    }
    public void cargar(float array[]){
        for(int i=0;i<array.length;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Dime la altura"+i+": ");
            array[i]=sc.nextFloat();
        }
    }
        public float calcularPromedio(){
            float suma=0;
            for(int i=0;i<array.length;i++)
          suma+=i;
            return suma/array.length;
                    
        }
         public int mayoresPromedio() {
        float promedio = calcularPromedio();
        int contador = 0;
        for (float altura : alturas) {
            if (altura > promedio) {
                contador++;
            }
        }
        return contador;
    }

    public int menoresPromedio() {
        float promedio = calcularPromedio();
        int contador = 0;
        for (int s=0: s<array.length;s++) {
            if (array < promedio) {
                contador++;
            }
        }
        return contador;
    }
        
        
    }
    
    
}
