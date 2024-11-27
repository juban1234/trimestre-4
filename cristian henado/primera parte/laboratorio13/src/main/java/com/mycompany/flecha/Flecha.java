/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flecha;

/**
 *
 * @author SENA
 */
public class Flecha {
    
    int longitud;
    String color;
    
    public Flecha(){
        longitud=18;
        color="negro"; 
    }
    
    public Flecha(int longitud,String color){
        this.longitud=longitud;
        this.color=color;
    }
    
    public void construirFlecha(){
        for (int i = 0; i < longitud; i++) {
            imprime("-");
        }
        imprime(">");
    }
    
    public void imprime(String simbolo){
        if (color.equals("negro")) {
            System.out.print(simbolo);
           
        } else {
            System.err.print(simbolo);
        }
    }
    
    public void imprimeEspacioblanco(){
        System.out.println();
    }
}
