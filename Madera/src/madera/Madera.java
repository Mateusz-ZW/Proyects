/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package madera;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Madera {

    /**
     * @param args the command line arguments
     */
   
    //funciones
     public static void cargaDatosObjeto (Tabla t1,Tabla t2,Tabla t3,Tabla t4) {
         boolean semaforo=true;
         
        boolean dividida=false;
        Scanner sc=new Scanner (System.in);
        do{
        System.out.println("Introduce codigo");
        int codigo=sc.nextInt();
        sc.nextLine(); //se introduce para evitar el error que produce la lectura de un int

    semaforo=true;
    if(codigo==t1.getCodigo()) {
            System.out.println("codigo ya registrado, prueba otra vez");
            semaforo=false;    }
    if(codigo==t2.getCodigo()) {
            System.out.println("codigo ya registrado, prueba otra vez");
            semaforo=false; }
    if(codigo==t3.getCodigo()) {
            System.out.println("codigo ya registrado, prueba otra vez");
            semaforo=false; }
    if(codigo==t4.getCodigo()){
         System.out.println("codigo ya registrado, prueba otra vez");
            semaforo=false; }
    }while(semaforo==false);
    //si el codigo es bueno,comenzamos con la carga de datos
         
        
    if(semaforo) {
        System.out.println("Introduce tipo de madera");
        String tipo=sc.nextLine();
        System.out.println("Introduce anchura");
        int anchura=sc.nextInt();
        System.out.println("Dime la longitud");
        int longitud=sc.nextInt();
        System.out.println(longitud<=40? "Longitud correcta":"No puede ser mayor a 40 cm");
        System.out.println("Dime el color: ");
        String color=sc.nextLine();
        System.out.println("Dime el espesor: ");
        long espesor=sc.nextLong();
        System.out.println("Dime cuantas existencias hay: ");
        long existencias=sc.nextLong();
        System.out.println("Quieres que se divida: (si/no)");
        String x=sc.nextLine();
        if(x.equals("si")){
            dividida=true;
        }
        else{
            dividida=false;
        }
    }
    else {
        System.out.println("no has metido bien el codigo. fin del programa");
    }
         
         
     
} 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Tabla t1=new Tabla("pino","blanco");
        Tabla t2=new Tabla("roble","morado");
        Tabla t3=new Tabla("haya","rojo");
        Tabla t4=new Tabla("olivo","verde");
        cargaDatosObjeto(t1,t2,t3,t4);
        
        
    }
   
    
}
