/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printacio;

/**
 *
 * @author mateo
 */
public class PETG extends Filamento{
    public PETG(String r, String c, double p, double pr){
        super(r,c,p,pr);
    }
    public String toString(){
        return "PETG: "+super.toString();
    }
}
