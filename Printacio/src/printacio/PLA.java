/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printacio;

/**
 *
 * @author mateo
 */
public class PLA extends Filamento{
    public PLA(String r, String c, double p, double pr){
        super(r,c,p,pr);
    }
    public String toString(){
        return "PLA: "+super.toString();
    }
}
