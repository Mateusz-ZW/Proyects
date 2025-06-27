/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg320;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static double Potencia(double b,int e){
        double res=1;
        //Es decir aqui ponemos un buvle for para que nos calcule la potencia
        //inicializamos la i a 0 para que en la condicion el bucle se haga hasta que la i se menor que e(exponente)
        //Es decir b=5 y e=2 entonces primero hace res=1*5=5 luego entra al bucle y sera res=5*5=25 (Vamos que el e indica cauntas veces entrara al bucle)
        
       for (int i = 0; i<e;i++){
        res=res*b;
        }
      return res;  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime la base: ");
        double base=sc.nextDouble();
        System.out.println("Dime el exponente: ");
        int exponente=sc.nextInt();
        System.out.println(Potencia(base,exponente));
        
        // TODO code application logic here
    }
    
}
