/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Procesos {
    
    HashMap<String, Estudientes> hashEstudiantes;
    double promedio2;
    
    public Procesos(){
        hashEstudiantes = new HashMap<>();
        int preg;
        do {         
            
            pedirDatos();
            preg = Integer.parseInt(JOptionPane.showInputDialog("pulse 1 si desao continuar"));
        } while (preg == 1);
        
        System.out.println(hashEstudiantes);
    }

    private void pedirDatos() {
        Estudientes datos = new Estudientes();
        datos.llenarDatos();
        calcularPromedio(datos);
        validarPromedio(datos);
        hashEstudiantes.put(datos.getNombre(), datos);
    }

    private void calcularPromedio(Estudientes datos) {
        promedio2 = (datos.getNota1() + datos.getNota2()+datos.getNota3()+datos.getNota4()) / 4;
        datos.setPromedio(promedio2);
    }

    private void validarPromedio(Estudientes datos) {
        
        if (promedio2 > 3.5) {
            datos.setResultado("gano la materia");
        } else {
            datos.setResultado("perdio la materia");
        }
    }
}
