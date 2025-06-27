/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class profesor extends Usuario{
    Scanner sc=new Scanner(System.in);
    public profesor(String dni, String nombre, String apellido, String contraseña){
        super(dni,nombre,apellido, contraseña);
    }
    public void leer(){
        System.out.println("Indica el dni del alumno: ");
        String dni=sc.nextLine();
        int lineas=Documento.leer(dni+".txt",true);
        if(lineas==1){
            System.out.println("El documento no existe o no se ha podido leer");
            
        }
    }
        public String toString(){
            return dni+" "+nombre+" "+ apellido;
        }
    }

