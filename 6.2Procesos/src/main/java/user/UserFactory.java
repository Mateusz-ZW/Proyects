/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author mateo
 */

public class UserFactory {
    public static UserDao getUser (String type) {
        if ("file".equalsIgnoreCase(type)) {
            return new UserDaoFile();
        }
        throw new IllegalArgumentException("Tipo de UserDao no soportado: " + type);
    }
}

