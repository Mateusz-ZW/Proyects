/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.pkg5;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
public class VectInt {
    private int[]a;
    public VectInt(int n){
        int[]a=new int[n];
    }
    public void cargar(int[]a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime una longitud del array: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
    }
    public void cargar(int a[],int a,int b){
        for(int i=0;i<a.length;i++){
         a[i] = random.nextInt(b - a + 1) + a;
    }
    }
}
