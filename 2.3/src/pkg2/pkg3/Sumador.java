/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2.pkg3;

/**
 *
 * @author mateo
 */
public class Sumador {
    public int suma(int n1,int n2){
        int res=0;
        for(int i=n1;i<=n2;i++){
            res+=i;
        }
        return res;
    }
    public static void main (String[] args){
        Sumador s=new Sumador();
        int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        int resultado= s.suma(n1, n2);
        System.out.println(resultado);
    }
}
