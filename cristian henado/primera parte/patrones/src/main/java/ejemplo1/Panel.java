/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author SENA
 */

public class Panel extends JFrame implements ActionListener{
    
    private JPanel mipanel;
    private JButton promedio;
    private JFormattedTextField nota1,nota2,nota3;
    
     public Panel(){
        iniciarComponentes();
        setTitle("calculador de notas");
        setSize(600, 500);
        setLocationRelativeTo(null);
    }
    

    private void iniciarComponentes() {
        mipanel = new JPanel();
        mipanel.setLayout(null);
        mipanel.setBackground(Color.CYAN);

        DecimalFormat decimalFormat = new DecimalFormat("#0.0"); 
        NumberFormatter numberFormatter = new NumberFormatter(decimalFormat);
        numberFormatter.setAllowsInvalid(false); 

        
        nota1 = new JFormattedTextField(numberFormatter);
        nota1.setBounds(100, 10, 100, 30);
        mipanel.add(nota1);

        
        nota2 = new JFormattedTextField(numberFormatter);
        nota2.setBounds(100, 50, 100, 30);
        mipanel.add(nota2);

        
        nota3 = new JFormattedTextField(numberFormatter);
        nota3.setBounds(100, 90, 100, 30);
        mipanel.add(nota3);

        
        promedio = new JButton("promedio");
        promedio.setBounds(100, 130, 100, 30);
        promedio.addActionListener(this);
        mipanel.add(promedio);
        
        add(mipanel);
    }
      @Override
    public void actionPerformed(ActionEvent e) {
        
            if (e.getSource()== promedio) {

            }
            
    }
}
