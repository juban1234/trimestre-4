package view;
import javax.swing.*;

import controller.Coordinador;
import model.PersonaDTO;
import model.Procesos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private JTextField txtNombre, txtDireccion, txtTelefono, txtSalario, txtTipo;
    private JButton btnCalcular,btnOtra;
    private JTextArea txtResultado;
	private Coordinador miCoordinador;

    public VentanaPrincipal() {
        setTitle("Cálculo de Salario Ajustado");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 100, 30);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(150, 20, 200, 30);
        add(txtNombre);

        JLabel lblDireccion = new JLabel("Dirección:");
        lblDireccion.setBounds(20, 60, 100, 30);
        add(lblDireccion);

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
        btnCalcular.setBounds(60, 220, 150, 30);
        add(btnCalcular);
        
        btnOtra = new JButton("Otra");
        btnOtra.setBounds(220, 220, 150, 30);
        add(btnOtra);

        txtResultado = new JTextArea();
        txtResultado.setBounds(20, 260, 340, 100);
        txtResultado.setEditable(false);
        add(txtResultado);

        btnCalcular.addActionListener(this);
        btnOtra.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
        	
        	PersonaDTO miPersona=new PersonaDTO();
        	
            miPersona.setNombre(txtNombre.getText()); 
            miPersona.setDireccion(txtDireccion.getText());
            miPersona.setTelefono(txtTelefono.getText());
            miPersona.setSalario(Double.parseDouble(txtSalario.getText()));
            miPersona.setTipo(Integer.parseInt(txtTipo.getText()));

            String resultado =miCoordinador.calcularSalario(miPersona);
            txtResultado.setText(resultado);
        }else  if (e.getSource() == btnOtra) {
        	miCoordinador.mostrarVentana(2);
        }
    }

	public void setCoordiandor(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}
}
