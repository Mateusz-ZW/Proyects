/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mateo
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestUser {
     private UserManager userManager = new UserManager();

    
    public void testSignUp() {
        User user = new User("1", "test@example.com", "John", "Doe");
        user.setPassword("password123");
        try {
            userManager.signUp(user, "password123");
        } catch (MyException e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }

    
    public void testLogin() {
        try {
            userManager.login("1", "password123");
        } catch (MyException e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }

   
    public void testSignUpUser Exists() throws MyException {
        User user = new User("1", "test@example.com", "John", "Doe");
        user.setPassword("password123");
        userManager.signUp(user, "password123");
        MyException exception = assertThrows(MyException.class, () -> {
            try {
                userManager.signUp(user, "password123");
            } catch (MyException ex) {
                Logger.getLogger(TestUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        assertEquals("El usuario:1 ya está registrado.", exception.getMessage());
    }

   
    public void testLoginInvalidPassword() throws MyException {
        User user = new User("1", "test@example.com", "John", "Doe");
        user.setPassword("password123");
        userManager.signUp(user, "password123");
        MyException exception = assertThrows(MyException.class, () -> {
            try {
                userManager.login("1", "wrongpassword");
            } catch (MyException ex) {
                Logger.getLogger(TestUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        assertEquals("Usuario o contraseña no válidos", exception.getMessage());
    }
}
