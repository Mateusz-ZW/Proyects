/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ev3evasanchez;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public abstract class Usuario implements Serializable {
    private String dni;
    private  String nom;
    private  String apell;
    private  String psw;
    public Usuario(String dni,String nom,String apell,String psw){
        this.dni=dni;
        this.nom=nom;
        this.apell=apell;
        this.psw=psw;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String toString() {
        return "Usuario\n" + "DNI:" + dni + "\nNombre:" + nom + "\nApellidos:" + apell;
    }
    
}
