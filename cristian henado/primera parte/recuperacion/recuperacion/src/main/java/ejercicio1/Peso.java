/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Peso {
    private String nombre;
    private double peso;
    private double talla;
    private double IMC;
   
    
    public void llenardatos(){
        nombre = JOptionPane.showInputDialog("ingrese su nombre");
        talla = Double.parseDouble(JOptionPane.showInputDialog("ingrese su altura en decimales un ejemplo 1.65"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("ingrese su peso en kilogramos"));
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getTalla() {
        return talla;
    }

    public double getIMC() {
        return IMC;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    @Override
    public String toString() {
        return " peso: " + peso + "\n"+" talla:" + talla + "\n"+ " tu IMC es de: " + IMC + '}'+"\n";
    }

}
