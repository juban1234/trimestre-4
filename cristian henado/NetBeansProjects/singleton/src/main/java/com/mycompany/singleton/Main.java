/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author SENA
 */
public class Main {
    public static void main(String[] args) {
        // Obtenemos la única instancia de Singleton
        Singleton misSingleton = Singleton.obtenerInstancia();
        
        // Llamamos a un método de la instancia Singleton
        misSingleton.mostrarMensaje();
        misSingleton.saludar();
        
        
        
        
    }
}
