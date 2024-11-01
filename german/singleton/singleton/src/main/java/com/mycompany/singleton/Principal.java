/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Principal {
    public static void main(String[] args) {
        UserService userService = new UserService();
        int numUsuarios = 0;

        int i = 1; 
        do {        
            i++;
            userService.createUser(JOptionPane.showInputDialog("ingrese su usuario"), "user" + i + "@example.com");
            numUsuarios++;
            
        } while (numUsuarios < 10);
        
        // Mostrar usuarios creados
        System.out.println();
        System.out.println("numero de Usuarios creados: "+numUsuarios);
        System.out.println();
        userService.getUsers().forEach(System.out::println);
    }
}
