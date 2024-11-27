/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaswin;


import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Datos {

    private String tipo;
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    double descuetos;


    public void llenarDatos(){
        nombre = JOptionPane.showInputDialog("ingrese su sin apellido nombre");
        apellido = JOptionPane.showInputDialog("ingrese su apellido");
        edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad"));
        telefono = JOptionPane.showInputDialog("ingrese su telefono");
        setTipo(tipo);
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }



    public void setTipo(String tipo) {
        int categoria = 0;
        
        tipo = JOptionPane.showInputDialog("ingrese su tipo de cliente"); 
        
        if ("A".equals(tipo)) {
            categoria = 1;
        }else if("B".equals(tipo)){
            categoria = 2;
        }else if("C".equals(tipo)){
            categoria = 3;
        }else{
            JOptionPane.showMessageDialog(null, "no existe esta categoria");
            setTipo(tipo);
        }
        
        switch (categoria) {
            case 1 -> descuetos = 0.4;
            case 2 -> descuetos = 0.2;
            case 3 -> descuetos = 0.1;
            default -> JOptionPane.showMessageDialog(null, "no tiene descuento");
        }
        
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
