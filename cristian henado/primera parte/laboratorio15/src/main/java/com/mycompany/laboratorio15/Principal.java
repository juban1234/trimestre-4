/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio15;

/**
 *
 * @author SENA
 */
public class Principal {

    public static void main(String[] args) {
       
       perro miPerro=new perro();
       miPerro.nombre="paco";
       miPerro.tipo="salvaje";
       miPerro.ladra();
       miPerro.alimentarse();
       miPerro.descansar();
       
       pincher misPer=new pincher();
       misPer.nombre="firulais";
       misPer.tipo="domestico";
       misPer.ladra();
       misPer.alimentarse();
       misPer.descansar();
    }
}
