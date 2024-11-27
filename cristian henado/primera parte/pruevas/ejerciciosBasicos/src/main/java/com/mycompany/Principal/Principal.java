/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Principal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<String> nombreEmpleado = new  ArrayList<>(); 
         ArrayList<Double> salarioEmpleado = new  ArrayList<>(); 
       
        
        int categoria = 0;
        double salarioActual = 0;
        double bonificacion = 0;
        double descunto = 0;
        double pago = 0;
        String nombre = "";
        double valorTotalPagos = 0;

        int cant = Integer.parseInt(JOptionPane.showInputDialog("cuantos ingresan en el sistema"));

        for (int i = 0; i < cant; i++) {
            nombre = JOptionPane.showInputDialog("ingrese su nombre");
            categoria = Integer.parseInt(JOptionPane.showInputDialog("categoria"));
            salarioActual = Double.parseDouble(JOptionPane.showInputDialog("ingrese salario actual"));
            switch (categoria) {
                case 1 -> {
                    bonificacion = 0.15;
                    descunto = 0.02;
                }

                case 2 -> {
                    bonificacion = 0.10;
                    descunto = 0.015;
                }

                case 3 -> {
                    bonificacion = 0.08;
                    descunto = 0.01;
                }

                case 4 -> {
                    bonificacion = 0.0;
                    descunto = 0.0;
                }
                default ->
                    System.out.println("la categorio no existe");

            }

            pago = salarioActual + (salarioActual * bonificacion) - (salarioActual * descunto);
            valorTotalPagos= valorTotalPagos+pago;

            System.out.println("hola " +nombre+"el valor a pagar es " + pago);
            nombreEmpleado.add(nombre);
            salarioEmpleado.add(pago);
            System.out.println("nombres "+nombreEmpleado);
        }
        
        System.out.println("el valor total a pagar es de "+valorTotalPagos);
        System.out.println("nombres "+nombreEmpleado);
        System.out.println("sueldos "+salarioEmpleado);

    }
}
