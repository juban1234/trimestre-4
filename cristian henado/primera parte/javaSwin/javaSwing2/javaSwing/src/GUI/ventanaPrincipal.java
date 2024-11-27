package GUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventanaPrincipal extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel miPanel;
	private JButton miboton;
    private JTextField nombre,color, edad,tipo;
    
	public ventanaPrincipal() {
        setTitle("tienda de mascotas");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
	}

	private void iniciarComponentes() {
		miPanel = new JPanel();
		miPanel.setLayout(null);
        miPanel.setBackground(Color.red);
        
        nombre = new JTextField();
        nombre.setBounds(10, 10, 100, 30);
        nombre.setText(getName());
        
		add(miPanel);
	}
}
