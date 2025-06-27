/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.pkg5.pkg1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class VectInt {
    private int[] a;
    
    public VectInt(int n){
        a=new int[n];
    }
    
    public void cargar(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.println("Dime el valor "+i+" para el array");
            a[i]=sc.nextInt();
        }
    }
    public void cargar(int b, int c){
        Random random = new Random();
        Scanner sc=new Scanner(System.in);
        //Lo que hace esta formula es hacer un numero random entre el numero a y b
       // double x=(Double)Math.random()*(c - b + 1) + b;
        for(int i=0;i<a.length;i++){
            System.out.println("Dime el valor "+i+" para el array");
            a[i]=random.nextInt(c - b + 1) + b;
        }
        
    }
    public double promedio(){
        double media=0;
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            
        }
        media=sum/a.length;
        return media;
        
    }
    public int moda(){
       int moda = a[0];
       int maxFrecuencia = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > maxFrecuencia) {
                maxFrecuencia = count;
                moda = a[i];
            }
        }
        return moda;
    }
    public double suma(){
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
           
        }
        return sum;
        
    }
    public String toString(){
         String result = "(";
        for (int i = 0; i < a.length; i++) {
            result += a[i];
            if (i < a.length - 1) {
                result += ", ";
            }
        }
        result += ")";
        return result;
    }
    }

