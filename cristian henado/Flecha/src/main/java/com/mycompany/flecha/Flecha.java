/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flecha;

/**
 *
 * @author SENA
 */
public class Flecha {

    // atributos o caracteristicas
    
    String nombre="R2d2";
    String material;
    String color;
    String tipo;
    double peso;
    
    // metodos o comportaminetos
    public Flecha(){
        System.out.println("ingresa el robot");
    }
    
    public void iniciar(){
        System.out.println(nombre+"el robot se enciende");
    }
    
    public void apagar(){
         System.out.println("el robot se apaga");
    }
    
    public void moverse(){
         System.out.println("el robot se mueve...");
    }
                   
    public void inprimir(){
        System.out.println("nombre: "+nombre);
    }
}
