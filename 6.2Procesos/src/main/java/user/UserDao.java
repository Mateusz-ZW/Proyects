/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package user;

import java.util.List;

/**
 *
 * @author mateo
 */
public interface UserDao {
    User findById(String id);
    List<User> findAll();
    void save(User user);
    void update(User user);
    void delete(String id);
}
