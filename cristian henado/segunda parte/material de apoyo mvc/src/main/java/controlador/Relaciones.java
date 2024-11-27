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

public class Relaciones {
    public static void main(String[] args) {
        // Se instancian las clases
        VentanaOperaciones ventanaOperaciones = new VentanaOperaciones();
        VentanaConsulta ventanaConsulta = new VentanaConsulta();
        Procesos misProcesos = new Procesos();
        Coordinador miCoordinador = new Coordinador();

        // Se establecen las relaciones entre clases
        ventanaOperaciones.setCoordinador(miCoordinador);
        ventanaConsulta.setCoordinador(miCoordinador);
        misProcesos.setCoordinador(miCoordinador);

        // Se establecen relaciones con la clase coordinador
        miCoordinador.setVentanaOperaciones(ventanaOperaciones);
        miCoordinador.setVentanaConsulta(ventanaConsulta);
        miCoordinador.setProcesos(misProcesos);

        // Mostrar ventana principal
        miCoordinador.mostrarVentanaPrincipal();
    }
}


