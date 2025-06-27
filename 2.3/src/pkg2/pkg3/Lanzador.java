/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2.pkg3;

import java.io.*;

/**
 *
 * @author mateo
 */
public class Lanzador {
    public void lanzarSumador(Integer n1,Integer n2,String fichResultado){
        String clase="pk2.pk3.Sumador";
        ProcessBuilder pb;
        Process p=null;
        try{
            pb=new ProcessBuilder("java",clase,n1.toString(),n2.toString());
            pb.directory(new File("./build/classes"));
            pb.redirectError(new File("errores.txt"));
            pb.redirectOutput(new File(fichResultado));
            pb.start();
           
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        Lanzador l=new Lanzador();
        
        l.lanzarSumador(1, 5, "result1.txt");
        l.lanzarSumador(6, 10, "result2.txt");
        System.out.println("Hecho");
    }
    
}
