/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author SENA
 */
public class UserConfig {
    private static UserConfig instance;
    private final int maxUsers = 10;

    // Constructor privado para evitar instanciación directa
    private UserConfig() {}

    // Método para obtener la instancia única
    public static synchronized UserConfig getInstance() {
        if (instance == null) {
            instance = new UserConfig();
        }
        return instance;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public boolean canCreateUser() {
        // Puedes implementar lógica adicional aquí, por ahora devuelve true
        return true;
    }
}

