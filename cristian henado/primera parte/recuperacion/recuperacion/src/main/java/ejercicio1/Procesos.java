/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Procesos {
    
    HashMap<String, Peso> pesoHas;
    int cantidadPersonas = 0;
    double talla2;
    double imc;
    
    public Procesos(){
        pesoHas = new HashMap<>();
        cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("cuantas personas quieeren medir su IMC"));
        for (int i = 0; i < cantidadPersonas; i++) {
            pedirDatos();
        }
        System.out.println("resultados");
        System.out.println(pesoHas);
        System.out.println();
        
    }

    private void pedirDatos() {
        Peso miPesos = new Peso();
        miPesos.llenardatos();
        calcularTalla(miPesos);
        calcularImc(miPesos);
        pesoHas.put(miPesos.getNombre(), miPesos);
    }
    
    private void calcularTalla(Peso miPesos){
        talla2 = miPesos.getTalla()* miPesos.getTalla();    
    }

    private void calcularImc(Peso miPesos) {
        imc = miPesos.getPeso()/talla2;
        miPesos.setIMC(imc);
    }
}
