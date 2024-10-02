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
    
    Flecha flecha1,flecha2,flecha3;
    
    public static void main(String[] args) {
        Principal iniciar = new Principal();
    }
    
    public Principal(){
        flecha1=new Flecha();
        flecha1.construirFlecha();
        flecha1.imprimeEspacioblanco();
        
        flecha2 = new Flecha();
        flecha2.longitud=34;
        flecha2.color="rojo";
        flecha2.construirFlecha();
        flecha2.imprimeEspacioblanco();
        
        flecha3 =new Flecha(12,"negro");
        flecha3.construirFlecha();
        flecha3.imprimeEspacioblanco();
    }
}
