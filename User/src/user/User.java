/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package user;

/**
 *
 * @author mateo
 */
public class User {

    private String id;
    private String email;
    private String surName;
    private String familyName;
    private String salt;
    private String password;

    // Constructor, getters y setters
    public User(String id, String email, String surName, String familyName) {
        this.id = id;
        this.email = email;
        this.surName = surName;
        this.familyName = familyName;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSurName() { return surName; }
    public void setSurName(String surName) { this.surName = surName; }
    public String getFamilyName() { return familyName; }
    public void setFamilyName(String familyName) { this.familyName = familyName; }
    public String getSalt() { return salt; }
    public void setSalt(String salt) { this.salt = salt; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
    

