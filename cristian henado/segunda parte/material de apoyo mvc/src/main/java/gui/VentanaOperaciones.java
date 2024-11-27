/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import controlador.Coordinador;
import javax.swing.JFrame;
import javax.swing.*;


/**
 *
 * @author SENA
 */
public class VentanaOperaciones extends JFrame {
    private Coordinador coordinador;

    public VentanaOperaciones() {
        setTitle("Ventana de Operaciones");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JTextField inputField = new JTextField();
        inputField.setBounds(50, 50, 200, 30);
        add(inputField);

        JButton processButton = new JButton("Procesar");
        processButton.setBounds(260, 50, 100, 30);
        add(processButton);

        JLabel resultLabel = new JLabel("Resultado:");
        resultLabel.setBounds(50, 100, 300, 30);
        add(resultLabel);

    }

    // Método para establecer el coordinador
    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    // Método para mostrar resultados
    public void mostrarResultado(String resultado) {
        JOptionPane.showMessageDialog(this, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
