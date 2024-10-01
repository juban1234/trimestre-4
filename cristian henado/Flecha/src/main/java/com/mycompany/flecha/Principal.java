/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flecha;

/**
 *
 * @author SENA
 */
public class Principal {
    public static void main(String[] args) {
        Flecha miFlecha = new Flecha();
        miFlecha.nombre="juan";
        miFlecha.iniciar();
        miFlecha.inprimir();
        miFlecha.moverse();
        miFlecha.apagar();
        System.out.println(miFlecha);
        System.out.println();
        
        
        Flecha miFlecha1 = new Flecha();
        miFlecha1.nombre="robotina";
        miFlecha1.iniciar();
        miFlecha1.inprimir();
        miFlecha1.moverse();
        miFlecha1.apagar();
        System.out.println(miFlecha);
    }
}
