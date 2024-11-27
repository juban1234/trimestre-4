/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobreEscritura;

/**
 *
 * @author SENA
 */
public class Perro extends Animal{

    public void dormir(){
        System.out.println("mi perro esta durminedo");
    }
    
    @Override
    public void sonido() {
        System.out.println("mi perro esta ladrando");
        super.sonido(); 
    }
    
    
}
