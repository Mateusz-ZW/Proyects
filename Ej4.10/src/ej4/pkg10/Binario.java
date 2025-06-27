/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4.pkg10;

/**
 *
 * @author mateo
 */
public class Binario {
    private long binario;
    public Binario(){}
    public Binario(long binario){
        this.binario=binario;
    }
    public Binario(int dec){
        toBinario(dec);
        
    }

    public long getBinario() {
        return binario;
    }

    public void setBinario(long binario) {
        this.binario = binario;
    }
    public long toBinario(long num){
        if(num==0)return 0;
        if(num==1)return 1;
        else
            
             binario=num%2;
        return toBinario(num/2)+binario;
    }
    public int toDecimal(String binario){
        return Integer.parseInt(binario, 2);
    }
    public boolean esValido(long num){
        if (binario.length() == 0) {
            return false;
        } else if (binario.length() == 1) {
            return binario.equals("0") || binario.equals("1");
        } else {
            if (!binario.substring(0, 1).equals("0") && !binario.substring(0, 1).equals("1")) {
                return false;
            }
            return esValido(binario.substring(1));
        }
            
        }
    }
}
