/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaswin;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SENA
 */

public class Panel extends JFrame implements ActionListener{  
    
    private JPanel mipanel;
    private JButton comprar,usuario,limpiar,registrar;
    private JLabel menu , resultadoBoton;
    
    Datos datos = new Datos();
    
    public Panel(){
        iniciarComponentes();
        setTitle("tienda de DON APARATO");
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    private void iniciarComponentes()  {
        
        mipanel = new JPanel();
        mipanel.setLayout(null);
        mipanel.setBackground(Color.CYAN);
        
        menu = new JLabel();
        menu.setBounds(250, 10, 100, 100); 
        menu();
        mipanel.add(menu);
            
        comprar = new JButton("Comprar");
        comprar.setBounds(50, 100, 100, 30);
        comprar.addActionListener(this);
        mipanel.add(comprar);
        
        usuario = new JButton("Usuario");
        usuario.setBounds(50, 200, 100, 30);
        usuario.addActionListener(this);
        mipanel.add(usuario);
        
        limpiar = new JButton("Limpiar");
        limpiar.setBounds(50, 300, 100, 30);
        limpiar.addActionListener(this);
        mipanel.add(limpiar);
        
        registrar = new JButton("registro");
        registrar.setBounds(50, 400, 100, 30);
        registrar.addActionListener(this);
        mipanel.add(registrar);
        
        
        resultadoBoton = new JLabel();
        resultadoBoton.setBounds(400, 100, 500, 300);
        mipanel.add(resultadoBoton);
        
        add(mipanel);
    }


    public void menu( ){
        menu.setText("<html> pollo");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()== comprar) {
            String productoN = JOptionPane.showInputDialog("ingrese el producto que desea");
        }

        if (e.getSource() == usuario) {
            resultadoBoton.setText("<html>nombre: " + datos.getNombre() + " " + datos.getApellido() + "<br>Tipo: " + datos.getTipo()
                    + "<br>Precio Total: $" + "<br>" + datos.descuetos + "<br>Precio Real: $" + "</html>");
        }
        
        if (e.getSource()== limpiar) {
            datos.llenarDatos();
        }
        
        if (e.getSource()== registrar) {
            datos.llenarDatos();
            registrar.setVisible(false);
        }
    }


}
