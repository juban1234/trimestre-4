/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1Javaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;



public class Calculadora extends JFrame {

    private JPanel mipanel;
    private JTextField numeros1;
    private JTextField numeros2;
    private JTextField numeros3;
    private JButton miboton;
    private JLabel resultadoLabel;

    public Calculadora() {
        IniciarComponentes();
        setTitle("Calculadora de sumas");
        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    private void IniciarComponentes() {
        mipanel = new JPanel();
        mipanel.setLayout(null);
        mipanel.setBackground(Color.red);

        numeros1 = new JTextField();
        numeros1.setBounds(50, 50, 100, 30);


        numeros2 = new JTextField();
        numeros2.setBounds(50, 100, 100, 30);

        numeros3 = new JTextField();
        numeros3.setBounds(50, 150, 100, 30);
  
        miboton = new JButton("Sumar");
        miboton.setBounds(50, 200, 100, 30);
        miboton.addActionListener(this::realizarSuma);
        
        resultadoLabel = new JLabel("Resultado: ");
        resultadoLabel.setBounds(200, 50, 200, 30);

        mipanel.add(numeros1); 
        mipanel.add(numeros2); 
        mipanel.add(numeros3); 
        mipanel.add(miboton); 
        mipanel.add(resultadoLabel);
        
        add(mipanel);
    }

    public void realizarSuma(ActionEvent e) {

        if (e.getSource() == miboton) {
            int num1 = Integer.parseInt(numeros1.getText());
            int num2 = Integer.parseInt(numeros2.getText());
            int num3 = Integer.parseInt(numeros3.getText());
            int suma = num1 + num2 + num3;
            resultadoLabel.setText("Resultado: " + suma);
        } else {
            JOptionPane.showInputDialog("no existe este numero");
        }

    }
}
