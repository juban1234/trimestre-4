package view;
import javax.swing.*;

import controller.Coordinador;
import model.Procesos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana2 extends JFrame  {
    private JTextField txtNombre, txtDireccion, txtTelefono, txtSalario, txtTipo;
    private JButton btnCalcular;
    private JTextArea txtResultado;
    private Procesos misProcesos=new Procesos();
	private Coordinador miCoordinador;

    public Ventana2() {
        setTitle("Cálculo de Salario Ajustado");
        setSize(600, 600);
        setLayout(null);


        iniciarComponentes();
    }

    private void iniciarComponentes() {
       

        txtDireccion = new JTextField();
        txtDireccion.setBounds(150, 60, 200, 30);
        add(txtDireccion);

        JLabel lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setBounds(20, 100, 100, 30);
        add(lblTelefono);

        txtTelefono = new JTextField();
        txtTelefono.setBounds(150, 100, 200, 30);
        add(txtTelefono);

        JLabel lblSalario = new JLabel("Salario:");
        lblSalario.setBounds(20, 140, 100, 30);
        add(lblSalario);

        txtSalario = new JTextField();
        txtSalario.setBounds(150, 140, 200, 30);
        add(txtSalario);

        JLabel lblTipo = new JLabel("Tipo (1/2):");
        lblTipo.setBounds(20, 180, 100, 30);
        add(lblTipo);

        txtTipo = new JTextField();
        txtTipo.setBounds(150, 180, 200, 30);
        add(txtTipo);

        btnCalcular = new JButton("Calcular Salario");
        btnCalcular.setBounds(120, 220, 150, 30);
        add(btnCalcular);

        txtResultado = new JTextArea();
        txtResultado.setBounds(20, 260, 340, 100);
        txtResultado.setEditable(false);
        add(txtResultado);

    }

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}


}
