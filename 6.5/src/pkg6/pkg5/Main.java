/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Main {
    public static FiguraGeometrica[] figuras;
    public static ArrayList<FiguraGeometrica> figuras2=new ArrayList();
    
    public static int menu(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op >3){
            System.out.println("1.Añadir figura");
            System.out.println("2.Mostrar figuras");
            System.out.println("3.Salir");
            op=sc.nextInt();
        }
        return op;
    }
    
    public static int menuFiguras(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        while(op<1 || op>4){
            System.out.println("1.Indica el tipo de figura: ");
            System.out.println("1.Rectangulo");
            System.out.println("2.Circulo");
            System.out.println("3.Rombo");
            System.out.println("4.Cuadrado");
            op=sc.nextInt();
        }
        return op;
        
    }
    public static Rectangulo crearRectagulo(){
         Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        int x = sc.nextInt();
        System.out.print("Y: ");
        int y = sc.nextInt();
        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        
        return new Rectangulo(x,y,base,altura);
    }
     public static Circulo crearCirculo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        int x = sc.nextInt();
        System.out.print("Y: ");
        int y = sc.nextInt();
        System.out.print("Radio: ");
        double radio = sc.nextDouble();        
        
        return new Circulo(x,y,radio);
    }
    public static Rombo crearRombo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        int x = sc.nextInt();
        System.out.print("Y: ");
        int y = sc.nextInt();
        System.out.print("Diagonal horizontal: ");
        double dH = sc.nextDouble();
        System.out.print("Diagonal Vertical: ");
        double dV = sc.nextDouble();
        
        return new Rombo(x,y,dH, dV);
    }
    
    public static Cuadrado crearCuadrado()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        int x = sc.nextInt();
        System.out.print("Y: ");
        int y = sc.nextInt();
        System.out.print("Lado: ");
        double lado = sc.nextDouble();        
        
        return new Cuadrado(x,y,lado);
    }
    public static FiguraGeometrica crearFigura(){
        int op=menuFiguras();
        switch(op){
            case 1: return crearRectagulo();
            case 2: return crearCirculo();
            case 3: return crearRombo();
            case 4: return crearCuadrado();
        }
        return null;
    }
    public static void añadirFigura(){
        FiguraGeometrica f=crearFigura();
        FiguraGeometrica[] aux; 
        if(figuras==null){
            aux=new FiguraGeometrica[1];
        }
        else{
            aux=new FiguraGeometrica[figuras.length+1];
            for(int i=0;i<figuras.length;i++){
                aux[i]=figuras[i];
            }
        }
        aux[aux.length-1]=f;
        figuras=aux;
    }
      public static void anadirFigura2()
    {
        FiguraGeometrica f = crearFigura();
        
        figuras2.add(f);
        
    }
    
    public static void mostrarFiguras()
    {
        for (int i = 0; i < figuras.length;i++)
        {
            figuras[i].mostrar();
        }
    }
    
    public static void mostrarFiguras2()
    {
        for (int i = 0; i < figuras2.size(); i++) {            
     
            FiguraGeometrica f = figuras2.get(i);
            f.mostrar();
     
            
        }
    }
    public static void main(String[] args) {
       int op = menu();
        while (op!=3)
        {
            switch (op)
            {
                case 1: añadirFigura(); break;
                case 2: mostrarFiguras(); break;
               /* case 1: anadirFigura2(); break;
                case 2: mostrarFiguras2(); break; */
            }
            op = menu();
        }
    }
    
}
