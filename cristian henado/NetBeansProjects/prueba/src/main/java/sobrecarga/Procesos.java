/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecarga;

/**
 *
 * @author SENA
 */
public class Procesos {
    public void suma(int x ,int y){
        int sum=x+y;
        System.out.println("la suma es : "+sum);
    }
    
        public void suma(double x ,double y){
        double sum=x+y;
        System.out.println("la suma de decimales es : "+sum);
    }
        
        public void suma(int x ,int y,int z){
        int sum=x+y;
        System.out.println("la suma de trs numeros es : "+sum);
    }
}
