/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.Coordinador;

/**
 *
 * @author SENA
 */

public class Procesos {
    private Coordinador coordinador;

    // Establecer el coordinador
    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    // Métodos de lógica del negocio
    public String procesarDato(String dato) {
        return "Procesado: " + dato.toUpperCase();
    }

    public String obtenerDatos() {
        return "Datos de ejemplo obtenidos del sistema.";
    }
}


