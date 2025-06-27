/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ev3evasanchez;

/**
 *
 * @author alumno
 */
public class Poeta extends Usuario {
 
    public Poeta(String dni,String nom,String apell,String psw){
        super(dni,nom,apell,psw);
     
    }

    @Override
    public String toString() {
        return "Poeta\n" + super.toString();
    }
    
}
