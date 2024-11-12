/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author SENA
 */
import javax.swing.*;

public class TiendaApp {
    public static void main(String[] args) {
        // Obtener la instancia única de la tienda
        TiendaElectrodomesticos tienda = TiendaElectrodomesticos.obtenerInstancia();
        
        // Menú principal
        String menu = "Bienvenido a la tienda de Electrodomésticos\n" +
                      "1. Ver productos\n" +
                      "2. Realizar compra\n" +
                      "3. Salir\n";
        
        boolean continuar = true;
        
        while (continuar) {
            // Mostrar el menú al usuario
            int seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch (seleccion) {
                case 1 -> // Ver productos
                    JOptionPane.showMessageDialog(null, tienda.mostrarProductos());
                case 2 -> {
                    // Realizar compra
                    String productoId = JOptionPane.showInputDialog("Ingrese el nombre del producto que desea comprar:");
                    tienda.realizarCompra(productoId);
                }
                case 3 -> {
                    // Salir
                    JOptionPane.showMessageDialog(null, "¡Gracias por visitar la tienda!");
                    continuar = false;
                }
                default -> JOptionPane.showMessageDialog(null, "Opción no válida, por favor intente nuevamente.");
            }
        }
    }
}

