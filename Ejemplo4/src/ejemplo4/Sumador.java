/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo4;

/**
 *
 * @author mateo
 */
public class Sumador {
    public int sumar(int n,int s){
        int res=0;
        for(int i=n;i<=s;i++){
            res+=i;
        }
        return res;
    }
    public static void main(String[] args){
        Sumador s=new Sumador();
        int res=0;
        int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        res=s.sumar(n1, n2);
        System.out.println(res);
    }
}
    

 