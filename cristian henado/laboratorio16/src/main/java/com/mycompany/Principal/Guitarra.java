/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Principal;


/**
 *
 * @author SENA
 */
public class Guitarra extends Instrumento {
    
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        
        this.tipo = tipo;
    }

    public void iniciar() {
        System.out.println("Inicia a tocar la guitarra");
    }

    @Override
    public void tocarInstrumento() {
        System.out.println("Está tocando una guitarra " + tipo);
    }

    @Override
    public void guardar() {
        System.out.println("Guitarra guardada.");
    }

    @Override
    public int vender(int valor) {
        System.out.println("Guitarra vendida por " + valor);
        return valor; 
    }

    public void mostrar() {
        System.out.println("Tipo de guitarra: " + tipo);
    }
}

