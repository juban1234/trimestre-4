/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_ancapsulacion;

/**
 *
 * @author SENA
 */
public class Personas {

    private String nombre;
    private int Edad;


    public Personas(String nombre, int Edad) {
        this.nombre = nombre;
        this.Edad = Edad;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        if (Edad < 0) {
            System.out.println("la edad debe ser positiva.");
        } else {
            this.Edad = Edad;
        }
    }


    public void mostrarInfo() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + Edad);
    }
}
