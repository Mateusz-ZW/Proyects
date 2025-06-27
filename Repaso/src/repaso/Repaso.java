/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Repaso {
    
    public static int suma(int n1,int n2){
        return n1+n2;
    }
    public static void mult(int n1,int n2){
        System.out.println("El resultado de la multiplicacion es: "+ n1*n2);
    }
    public static int cuad(int n1){
        return n1*n1;
    }
    public static int[] arre(int n1,int n2){
        int[] vector = new int[4];
		vector[0] = suma(n1, n2);
		vector[1] = (n1 * n2);
		vector[2] = cuad(n1);
		vector[3] = cuad(n2);
		return vector;
    }
    public static int factorial(int n1){
        int res=0;
        int fact=1;
        
        for(int i=n1;i>=1;i--){
              fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=suma(3456,9847);
        System.out.println("Suma: "+sum);
        mult(sum,283);
        int sume=suma(46,390);
        System.out.println("Suma: "+sume);
        mult(46,390);
        System.out.println("Cuadrado: "+cuad(46));
        System.out.println("Cuadrado: "+cuad(390));
        System.out.println("Dime un numero para el factorial: ");
        int n=sc.nextInt();
        int f=factorial(n);
        System.out.println("El factorial de "+n+" es= "+f);
    }
    
}
