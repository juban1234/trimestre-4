/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import javax.swing.JOptionPane;

/**
 *Suponga que se desea ordenar el cambio de gramilla de una cancha de futbol,
 * el costo de la gramilla es de acuerdo al área en metros cuadrados. La forma de la cancha es rectangular, 
 * por lo tanto se hace necesario conocer las longitudes de los lados (Lado A y Lado B)
 * para poder obtener el área de la cancha.
 */

public class Inicio {
    
    public Inicio(){
        calcularArea();
    }
    
    public double ingresarLados(){
        double lado1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el lado A"));
        double lado2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el lado B"));
        double areafinal = lado1*lado2;
        return areafinal;
    }
    
    public void calcularArea(){
        double area = ingresarLados();
        System.out.println("el ara del campo es de "+area);
    }
}
 


    

