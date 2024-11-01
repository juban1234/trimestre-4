/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author SENA
 */

import java.util.HashMap;


public class UserService {
    private HashMap<String,String> users;

    public UserService() {
        users = new HashMap<>();
    }

    public boolean createUser(String username, String email) {

        
        if (UserConfig.getInstance().canCreateUser() && users.size() < UserConfig.getInstance().getMaxUsers()) {
            User user = new User(username, email);
            users.put(UserService,users);
            System.out.println("Usuario creado: " + user);
            return true;
        } else {
            System.out.println("No se puede crear el usuario. Límite alcanzado o configuración no permitida.");
            return false;
        }
    }

    public HashMap<String,String> getUsers() {
        return users;
    }
}

