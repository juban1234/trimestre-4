/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Principal;

/**
 *
 * @author SENA
 */
public class Flauta extends Instrumento{
    
    private int tamaño;
    
     public int getTamaño() {
        return tamaño;
    }
    
    public void setTamaño(int tamaño){
        this.tamaño = tamaño;
    }
    
    public void limpiar(){
        System.out.println("limpia la flauta");
    }
    
    @Override
    public void tocarInstrumento(){
        System.out.println("esta tocando una fluta de "+tamaño);
    }

    @Override
    public void guardar() {
        System.out.println("guarda la flauta");
    }

    @Override
    public int vender(int valor) {
        return 0;
    }

}

