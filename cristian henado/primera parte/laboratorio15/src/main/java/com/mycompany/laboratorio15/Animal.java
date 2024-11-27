/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio15;

/**
 *
 * @author SENA
 */
public class Animal {
    String tipo;
    public String nombre;
    
    public void alimentarse(){
        System.out.println(nombre+" se alimenta");
    }
    
    public void descansar(){
        System.out.println(nombre+" esta descansando es de raza "+tipo);
    }
}
