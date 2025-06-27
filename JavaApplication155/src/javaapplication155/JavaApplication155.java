/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication155;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class JavaApplication155 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        Scanner sc=new Scanner(System.in);
        //String nombre="Ej1.txt";
        System.out.println("Dime el nombre del fichero: ");
        String nombre=sc.nextLine();
        
        try{
            ArrayList<String>ar=new ArrayList();
        File f=new File(nombre);
        BufferedReader br=new BufferedReader(new FileReader(f));
     
        String linea;
         int contadorLineas=0;
        while((linea=br.readLine())!=null){
            
            ar.add(linea);
            contadorLineas++;
           
        }
        br.close();
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        System.out.println("-------------------");

            if(contadorLineas < 10) {
		for(int i = 0; i < contadorLineas; i++) {
		System.out.println(ar.get(i));
		}
		} 
            else 
                {
		for (int i = contadorLineas - 10; i < contadorLineas; i++) {
		System.out.println(ar.get(i));
		}
	}
        }
        catch(FileNotFoundException e){
            System.out.println("Fichero no encontrado");
        }
        catch(Exception e){
            System.out.println("El archivo esta vacio");
        }
        
        
        
    
}
}
