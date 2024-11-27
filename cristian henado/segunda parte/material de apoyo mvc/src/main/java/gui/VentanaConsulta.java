/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author SENA
 */
import controlador.Coordinador;
import javax.swing.*;

public class VentanaConsulta extends JFrame {
    private Coordinador coordinador;

    public VentanaConsulta() {
        setTitle("Ventana de Consulta");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLayout(null);

        JButton consultarButton = new JButton("Consultar");
        consultarButton.setBounds(50, 50, 100, 30);
        add(consultarButton);

        JTextArea datosArea = new JTextArea();
        datosArea.setBounds(50, 100, 300, 60);
        datosArea.setEditable(false);
        add(datosArea);

        consultarButton.addActionListener(e -> {
            coordinador.consultarDatos();
        });
    }

    // Método para establecer el coordinador
    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    // Método para mostrar datos
    public void mostrarDatos(String datos) {
        JOptionPane.showMessageDialog(this, datos, "Datos", JOptionPane.INFORMATION_MESSAGE);
    }
}
