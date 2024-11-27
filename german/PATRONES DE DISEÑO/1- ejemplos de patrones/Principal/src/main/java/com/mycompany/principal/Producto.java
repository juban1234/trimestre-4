/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import java.util.HashMap;
/**
 *
 * @author SENA
 */
public class Producto {
    private static Producto instancia; 
    HashMap<String, Integer> productos;
    
    private String nombre = "papa";
    private int cantidad = 1;
    
    private Producto (){
        productos = new HashMap<>();
        crearProducto();
        mostrarProductos();
    }
    
    public static synchronized Producto obtenerInstancia(){
        if(instancia == null){
            instancia = new Producto();
        }
        return instancia;
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    private void crearProducto() {
        productos.put(nombre, cantidad);
    }

    @Override
    public String toString() {
        return "Producto{ nombre=" + nombre  + ", cantidad=" + cantidad + '}';
    }

    private void mostrarProductos() {
        System.out.println(toString());
    }
   
}
