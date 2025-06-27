/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.pkg20;

/**
 *
 * @author mateo
 */
public class Email {
    private String email;
    public Email(){}
    public Email(String email){this.email=email;}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public boolean esCorrecto(String email){
        int pos = email.indexOf("@");
        if (pos==-1) return false;
        String sub = email.substring(pos);
        return (sub.charAt(sub.length()-1)!='.' && sub.contains("."));
        
            
        }
    }
    

