/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecarga;

/**
 *
 * @author SENA
 */
public class Principal {
    public static void main(String[] args) {
        Procesos miProceso = new Procesos();
        miProceso.suma(1, 2);
        miProceso.suma(.1, .2);
        miProceso.suma(1, 2, 3);
    }
}
