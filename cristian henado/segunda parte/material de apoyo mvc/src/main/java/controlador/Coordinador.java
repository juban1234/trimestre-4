/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import gui.VentanaConsulta;
import gui.VentanaOperaciones;
import modelo.Procesos;

/**
 *
 * @author SENA
 */

public class Coordinador {
    private VentanaOperaciones ventanaOperaciones;
    private VentanaConsulta ventanaConsulta;
    private Procesos procesos;

    // Métodos setters para establecer las relaciones
    public void setVentanaOperaciones(VentanaOperaciones ventanaOperaciones) {
        this.ventanaOperaciones = ventanaOperaciones;
    }

    public void setVentanaConsulta(VentanaConsulta ventanaConsulta) {
        this.ventanaConsulta = ventanaConsulta;
    }

    public void setProcesos(Procesos procesos) {
        this.procesos = procesos;
    }

    // Métodos para interactuar entre las vistas y la lógica
    public void realizarOperacion(String dato) {
        String resultado = procesos.procesarDato(dato);
        ventanaOperaciones.mostrarResultado(resultado);
    }

    public void consultarDatos() {
        String datos = procesos.obtenerDatos();
        ventanaConsulta.mostrarDatos(datos);
    }

    // Método para mostrar la ventana principal
    public void mostrarVentanaPrincipal() {
        ventanaOperaciones.setVisible(true);
    }
}


