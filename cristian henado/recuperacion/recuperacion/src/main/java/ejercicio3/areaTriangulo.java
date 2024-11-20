/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class areaTriangulo {
    public static void main(String[] args) {
        int base;
        int altura;
        int area;
        
        do {            
            base= Integer.parseInt(JOptionPane.showInputDialog("ingrese la base"));
        } while (base < 0);
        
        
        do {            
            altura= Integer.parseInt(JOptionPane.showInputDialog("ingrese la altura"));
        } while (altura < 0);
        
        area = ((base * altura )/ 2);
        
        System.out.println("la area es de: "+area);
        
        if (area >= 200) {
            System.out.println("es una gra area: "+area);
        }
    }
}
