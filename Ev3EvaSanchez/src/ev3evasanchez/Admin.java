/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ev3evasanchez;

/**
 *
 * @author alumno
 */
public class Admin extends Usuario{
    public Admin(String dni,String nom,String apell,String psw){
        super(dni,nom,apell,psw);
    }

    @Override
    public String toString() {
        return "Administrador\n" +super.toString();
    }
    
}
