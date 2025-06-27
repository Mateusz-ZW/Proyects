/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg7;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []a=new int[6000];
        int []frecuencias=new int[6];
        for(int i=0;i<a.length;i++){
            int resultado = (int) (Math.random() * 6) + 1;
            a[i]=resultado;
            frecuencias[resultado - 1]++; // Incrementar la frecuencia de la cara correspondiente
        }
        System.out.println("Frecuencia de cada cara del dado y su proporción:");
        for (int i = 0; i < 6; i++) {
            double proporcion = (double) frecuencias[i] / 6000 * 100;
            System.out.printf("Cara %d: %d veces (%.2f%%)\n", i + 1, frecuencias[i], proporcion);
        }
    }
    
}
