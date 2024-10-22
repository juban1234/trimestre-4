/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public final class Procesos {
    public Procesos(){
        pedirDatos();
        
    }
    
    public void pedirDatos(){
        datos miP = new datos();
        
        miP.setNombre(JOptionPane.showInputDialog("ingrese su nombre"));
        miP.setDocumento(JOptionPane.showInputDialog("ingrese el documento"));
        miP.setSalarioActual(Double.parseDouble(JOptionPane.showInputDialog("ingrese su salarioaxtuial")));
    }
}
