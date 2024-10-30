/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Producto {

    private int StockProducto;
    private String nombreProducto;
    private double presioUnitario;
    private int producto;

    public void llenarDatos() {
        
        String menuProducto = "productos disponible\n";
        menuProducto += "(1) papas \n";
        menuProducto+= "(2) huevos \n";
        menuProducto+= "(3) tomates\n";
        menuProducto+="(4) Pollo";
        producto = Integer.parseInt(JOptionPane.showInputDialog(menuProducto));
        StockProducto = Integer.parseInt(JOptionPane.showInputDialog("cuantos productos quieres "));
    }

    public int getProducto() {
        return producto;
    }
    
    public int getStockProducto() {
        return StockProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPresioUnitario() {
        return presioUnitario;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }
    
    public void setPresioUnitario(double presioUnitario) {
        this.presioUnitario = presioUnitario;
    }

    public void setStockProducto(int StockProducto) {
        this.StockProducto = StockProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
}
