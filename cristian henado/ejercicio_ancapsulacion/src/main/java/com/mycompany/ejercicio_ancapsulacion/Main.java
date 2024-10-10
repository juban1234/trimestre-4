/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_ancapsulacion;

/**
 *
 * @author SENA
 */
public class Main {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan Pérez", 3000.0);
        empleado1.mostrarInfo();
        empleado1.setNombre("Carlos Ruiz");
        empleado1.setSalario(3500.0);
        empleado1.setSalario(-1000.0); 
        empleado1.mostrarInfo();
    }
}
