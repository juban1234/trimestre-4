/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

import javax.swing.JOptionPane;



/**
 *
 * @author SENA
 */
public class PersonaDTO {
    private int id;
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    public PersonaDTO() {
    }
    
    public PersonaDTO(int id, String nombre, double nota1, double nota2, double nota3, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = promedio;
    }
    
    public void llenarDatos(){
        setId(id);
        setNombre(nombre);
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota1() {
        
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setId(int id) {
        id = Integer.parseInt(JOptionPane.showInputDialog("ingresa tu id"));
        this.id = id;
    }

    public void setNombre(String nombre) {
        nombre = JOptionPane.showInputDialog("ingresa tu nombre");
        this.nombre = nombre;
    }

    public void setNota1(double nota1) {
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa tu nota 1"));
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa tu nota 2"));
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        nota3 = Integer.parseInt(JOptionPane.showInputDialog("ingresa tu nota 3"));
        this.nota3 = nota3;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "PersonaDTO{" + "id=" + id + ", nombre=" + nombre + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", promedio=" + promedio + '}';
    }

    
}

