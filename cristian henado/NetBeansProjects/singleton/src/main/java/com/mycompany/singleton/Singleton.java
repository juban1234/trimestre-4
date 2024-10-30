/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singleton;

/**
 *
 * @author SENA
 */
public class Singleton {

    // Creamos una instancia estática de la clase, inicializada a null
    private static Singleton instanciaUnica;

    // Constructor privado para evitar la creación de nuevos objetos desde fuera de la clase
    private Singleton() {
        // Código de inicialización
    }

    // Método público estático que retorna la única instancia
    public static Singleton obtenerInstancia() {
        if (instanciaUnica == null) {
            // Se crea la instancia única la primera vez que se invoca este método
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    // Ejemplo de método de la clase Singleton
    public void mostrarMensaje() {
        System.out.println("¡Este es el único objeto Singleton!");
    }
    
    public void saludar(){
        System.out.println("hola como estas");
    }
}

