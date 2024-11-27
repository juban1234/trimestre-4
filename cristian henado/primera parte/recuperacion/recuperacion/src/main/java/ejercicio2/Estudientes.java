/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Estudientes {

    private String nombre;
    private String materia;
    private double nota1 ;
    private double nota2 ;
    private double nota3 ;
    private double nota4 ;
    private double promedio;
    private String resultado;

    public void llenarDatos() {
        nombre = JOptionPane.showInputDialog("ingrese su nombre");
        materia = JOptionPane.showInputDialog("ingrese su materia");
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
        setNota4(nota4);
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria() {
        return materia;
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

    public double getNota4() {
        return nota4;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getResultado() {
        return resultado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setNota1(double nota1) {
       
        do {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("ingresa la nota 1"));
        } while (nota1 < 0 || nota1 > 5);
         this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        
        do {
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("ingresa la nota 2"));
        } while (nota2 < 0 || nota2 > 5);
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        
        do {
            nota3 = Double.parseDouble(JOptionPane.showInputDialog("ingresa la nota 3"));
        } while (nota3 < 0 || nota3 > 5);
        this.nota3 = nota3;
    }

    public void setNota4(double nota4) {
        
        do {
            nota4 = Double.parseDouble(JOptionPane.showInputDialog("ingresa la nota 4"));
        } while (nota4 < 0 || nota4 > 5);
        this.nota4 = nota4;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "{" + "materia=" + materia + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + ", promedio=" + promedio + ", resultado=" + resultado + '}';
    }

}
