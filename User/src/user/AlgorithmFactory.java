/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author mateo
 */
public class AlgorithmFactory {
     public static Algorithm getAlgorithm(String name) {
        if ("MD5".equalsIgnoreCase(name)) {
            return new AlgorithmMd5();
        }
        return null;
    }
}

