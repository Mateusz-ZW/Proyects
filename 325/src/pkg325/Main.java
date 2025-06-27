/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg325;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void areaVol(double radio,double altura,char c){
        final double PI=3.14159;
        
        if(c=='a'){
            System.out.println("El area es "+2*PI*radio*altura+2*PI*radio*radio);
        }
        else if(c=='v'){
            System.out.println("El volumen es "+PI*radio*radio*altura);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime v para volumen o a para el area: ");
        String texto=sc.next();
        System.out.println("Dime el radio: ");
        double radio=sc.nextDouble();
        System.out.println("Dime la altura: ");
        double altura=sc.nextDouble();
        while(texto.length()!=1){
            System.out.println("Debes introducir solo un caracter");
            texto=sc.next();
        }
        areaVol(altura,radio,texto.charAt(0));
        
        // TODO code application logic here
    }
    
}
