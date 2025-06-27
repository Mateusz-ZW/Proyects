/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg4.pkg1;

/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Alturas a1 = new Alturas();
        a1.cargar();
        
        Alturas a2 = new Alturas(1.70f,1.5f,1.8f,1.56f,1.82f);
        
        System.out.println("Datos alturas 1");
        System.out.println("Promedio: "+a1.calculaPromedio()+"\n"+
                            "Mayores que el promedio: "+a1.mayoresPromedio()+"\n"+
                            "Menores que el promedio: "+a1.menoresPromedio()+"\n");
        System.out.println("Datos alturas 2");
        System.out.println("Promedio: "+a2.calculaPromedio()+"\n"+
                            "Mayores que el promedio: "+a2.mayoresPromedio()+"\n"+
                            "Menores que el promedio: "+a2.menoresPromedio());
    }
    
}
    
    

