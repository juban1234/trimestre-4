/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Principal;

/**
 *
 * @author SENA
 */
public class Principal {
    public static void main(String[] args) {
        Guitarra miGuitarra = new Guitarra();
        miGuitarra.setTipo("acústica"); 
        miGuitarra.iniciar();
        miGuitarra.tocarInstrumento();
        miGuitarra.mostrar();
        System.out.println("");
        miGuitarra.guardar();
        System.out.println("");
        
        Flauta miFlauta = new Flauta();
        miFlauta.setTamaño(30);
        miFlauta.tocarInstrumento();
        System.out.println("la fluta mide "+miFlauta.getTamaño());
        miFlauta.limpiar();
        miFlauta.guardar();
    }

}
