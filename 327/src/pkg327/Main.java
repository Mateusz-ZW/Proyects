/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg327;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int sumaN(int numero){
        //Si el numero es menor que 10 pues como no ha suma que se pueda hacer porque no se puede descomponer en digitos pues se retorna el numero tal y como es
        if(numero<10){
            System.out.println(numero);
            return numero;
        }
        else{
            //Aqui iniciamos una variable entera que sera la suma de los digitos
            //decimos que la funcion suma hara numero /10 y le sume el resto del numero
            //ejemplo 15, 15/10=1 y el resto es 5 pues sera, 1+5=6
            int suma=sumaN(numero/10)+numero%10;
            System.out.printf("+"+numero%10);
            return suma;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int n=sc.nextInt();
        while(n>=0){
            System.out.printf("="+sumaN(n));
            n=sc.nextInt();
        }
        
        // TODO code application logic here
    }
    
}
