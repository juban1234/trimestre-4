/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class TiendaElectrodomesticos {
    // Instancia única de la clase (Singleton)
    private static TiendaElectrodomesticos instancia;
    // Almacén de productos
    private Map<String, Producto> productos;

    // Constructor privado para evitar instanciación externa
    private TiendaElectrodomesticos() {
        productos = new HashMap<>();
        cargarProductos();
    }

    // Método para obtener la instancia única de la tienda
    public static synchronized TiendaElectrodomesticos obtenerInstancia() {
        if (instancia == null) {
            instancia = new TiendaElectrodomesticos();
        }
        return instancia;
    }

    // Cargar algunos productos de ejemplo
    private void cargarProductos() {
        productos.put("TV", new Producto("Tv", 499.99));
        productos.put("Refrigerador", new Producto("Refrigerador", 799.50));
        productos.put("Lavadora", new Producto("Lavadora", 320.75));
        productos.put("Microondas", new Producto("Microondas", 150.00));
    }

    // Mostrar todos los productos disponibles
    public String mostrarProductos() {
        StringBuilder lista = new StringBuilder("Productos disponibles:\n");
        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            lista.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return lista.toString();
    }

    // Realizar una compra
    public boolean realizarCompra(String productoId) {
        Producto producto = productos.get(productoId);
        if (producto != null) {
            JOptionPane.showMessageDialog(null, "¡Compra exitosa! Has comprado: " + producto);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
            return false;
        }
    }
}
