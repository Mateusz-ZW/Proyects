/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutar;

/**
 *
 * @author mateo
 */
public class Contador {
    private int c=0;
    public Contador(int c){this.c=c; }
    
    public void incrementar(){c+=1;}
    public void decrementar(){c-=1;}
    public int getValor(){return c;}
}
