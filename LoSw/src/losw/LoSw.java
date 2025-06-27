/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package losw;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class LoSw {

    /**
     * @param args the command line arguments
     */
    public static void Conversor(double euros,char c){
        if(c=='l'){
            System.out.println("El numero de yenes es "+ 159.852*euros);
        }
        else if(c=='d'){
            System.out.println("El numero de dolares es "+1.0611*euros);
        }
        else if(c=='l'){
            System.out.println("El numero de libras es "+0.87*euros);
        }
        else
            System.out.println("Introduce uno de los caracteres dichos");
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    System.out.println("Dime l para libras, d para dolares, y para yenes");
    String texto=sc.next();
    System.out.println("Dime la cantidad de euros: ");
    double euros=sc.nextDouble();
    while(texto.length()!=1){
        System.out.println("Debes introducir solo un caracter");
        texto=sc.next();
    }
            Conversor(euros,texto.charAt(0));
    }
    
}
