/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author SENA
 */
public class Panel extends JFrame implements ActionListener{
    
    private JPanel miPanel;
    private JButton empesar,datos;
    private JLabel resultado;
    
    public Panel(){
        iniciarComponentes();
        setTitle("calculador de notas");
        setSize(600, 500);
        setLocationRelativeTo(null);
    }

    private void iniciarComponentes() {
               setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        miPanel = new JPanel();
        miPanel.setLayout(null);
        
        empesar = new JButton("empesar");
        empesar.setBounds(100, 10, 100, 30);
        empesar.setBackground(Color.cyan);
        empesar.addActionListener(this);
        miPanel.add(empesar);
        
        datos = new JButton("datos de las mascotas");
        datos.setBounds(100, 50, 100, 30);
        datos.setBackground(Color.red);
        miPanel.add(datos);
        
        resultado = new JLabel();
        resultado.setBounds(100, 100, 200, 300);
        miPanel.add(resultado);
        
        add(miPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== empesar) {
            resultado.setText("hola");
        }
    }
    
}
