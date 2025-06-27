/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author mateo
 */
import java.util.Date;
public class UserManager {
    private UserDao userDao;

    public UserManager() {
        this.userDao = UserFactory.getUser Dao("file");
    }

    public void signUp(User user, String pass_bis) throws MyException {
        if (userDao.findById(user.getId()) != null) {
            throw new MyException("El usuario:" + user.getId() + " ya está registrado.");
        }
        if (!user.getPassword().equals(pass_bis)) {
            throw new MyException("Las contraseñas no coinciden");
        }
        String salt = new AlgorithmMd5().crypt(new Date().getTime() + user.getId() + user.getEmail());
        user.setSalt(salt);
        user.setPassword(new AlgorithmMd5().crypt(salt + user.getPassword()));
        try {
            userDao.save(user);
        } catch (Exception e) {
            throw new MyException("Ha ocurrido un error guardando el usuario");
        }
    }

    public void login(String user_id, String passwd) throws MyException {
        User user = userDao.findById(user_id);
        if (user == null) {
            throw new MyException("Usuario o contraseña no válidos");
        }
        String hashedPassword = new AlgorithmMd5().crypt(user.getSalt() + passwd );
        if (!hashedPassword.equals(user.getPassword())) {
            throw new MyException("Usuario o contraseña no válidos");
        }
    }
}
