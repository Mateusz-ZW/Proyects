/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateo
 */
public class UserDaoFile implements UserDao{
  private final String filePath = "users.txt";

    @Override
    public User findById(String id) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(id)) {
                    return new User(data[0], data[1], data[2], data[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                users.add(new User(data[0], data[1], data[2], data[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public void save(User user) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(user.getId() + "," + user.getEmail() + "," + user.getSurName() + "," + user.getFamilyName());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(User user) {
        List<User> users = findAll();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (User  u : users) {
                if (u.getId().equals(user.getId())) {
                    bw.write(user.getId() + "," + user.getEmail() + "," + user.getSurName() + "," + user.getFamilyName());
                } else {
                    bw.write(u.getId() + "," + u.getEmail() + "," + u.getSurName() + "," + u.getFamilyName());
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        List<User> users = findAll();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (User  u : users) {
                if (!u.getId().equals(id)) {
                    bw.write(u.getId() + "," + u.getEmail() + "," + u.getSurName() + "," + u.getFamilyName());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

