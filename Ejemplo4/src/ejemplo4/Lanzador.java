/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo4;

import java.io.*;

/**
 *
 * @author mateo
 */
public class Lanzador {
    public void lanzarSumador(Integer n1,Integer n2,String fichResultado){
        String clase="ejemplo4.Sumador";
        
        ProcessBuilder pb;
        try{
        pb= new ProcessBuilder("java",clase,n1.toString(),n2.toString());
        
        pb.directory(new File("./build/classes"));
        pb.redirectError(new File("errores.txt"));
        pb.redirectOutput(new File(fichResultado));
        pb.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
  
        
    }

