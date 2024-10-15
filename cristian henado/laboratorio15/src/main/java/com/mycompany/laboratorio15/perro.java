/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio15;

/**
 *
 * @author SENA
 */
public class perro extends Animal{
    private String raza;

    public void ladra(){
        System.out.println(nombre+" ladra");
    }
    
    public String getRaza(){
        return raza;
    }
    
    public void tipoRaza(){
        System.out.println(nombre+" es de raza "+raza);
    }

}
