/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.pkg5;

/**
 *
 * @author mateo
 */
public class Rectangulo extends FiguraGeometrica{

    protected double base;
    protected double altura;
    
    public Rectangulo(){}
    
    public Rectangulo(int x,int y,double base, double altura){
    super(x,y);
    this.base = base;
    this.altura = altura;
    }
    
    public double area()
    { return base * altura;}
    
    public double perimetro()
    {  return 2*(base+altura);
    }
    public void mostrar()
    { System.out.println("Rectángulo");
      System.out.println("x"+x+"\ny"+y+"\nbase"+base+"\naltura"+altura);
      System.out.println("Área"+area()+"\nPerimetro"+perimetro());
    } 
    
}
