/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author SENA
 */
public class datos {
        private String documento;
    private String nombre;
    private double salarioActual;
    private int categoria;
    private double bonoficacion;
    private double descuento;
    private double valorPago;

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioActual() {
        return salarioActual;
    }

    public double getDescuento() {
        return descuento;
    }

    public int getCategoria() {
        return categoria;
    }

    public double getValorPago() {
        return valorPago;
    }
    
    public double getBonoficacion() {
        return bonoficacion;
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

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void setBonoficacion(double bonoficacion) {
        this.bonoficacion = bonoficacion;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    
}
