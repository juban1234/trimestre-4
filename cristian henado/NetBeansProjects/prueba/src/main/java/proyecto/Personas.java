package proyecto;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SENA
 */
public class Personas {
    
    private String documento;
    private String nombre;
    private double salarioActual;
    private int categoria;
    private double bonificacion;
    private double descuento;
    private double valorPago;
    
    
    public void llenarDatos(){
        nombre = JOptionPane.showInputDialog("ingrese su nombre");
        documento = JOptionPane.showInputDialog("ingrese su documento");
        salarioActual = Double.parseDouble(JOptionPane.showInputDialog("ingrese su salario"));
        categoria = Integer.parseInt(JOptionPane.showInputDialog("ingrese su categoria"));
        
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalarioActual(double salarioActual) {
        this.salarioActual = salarioActual;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioActual() {
        return salarioActual;
    }

    public int getCategoria() {
        return categoria;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getValorPago() {
        return valorPago;
    }

    @Override
    public String toString() {
        return "Personas{" + "documento=" + documento + ", nombre=" + nombre + ", salarioActual=" + salarioActual + ", categoria=" + categoria + ", bonificacion=" + bonificacion + ", descuento=" + descuento + ", valorPago=" + valorPago + '}';
    }
    
}
