/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Procesos {
    
    double valorTotal = 0;
    double valorTotalP = 0;
    int cantidadProducto = 0;
    HashMap<String, Producto> productosMAp;
    
    public Procesos(){
        productosMAp = new HashMap<>();
        
        cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog("cuantos productos quieres en tu compra"));
        
        for (int i = 0; i < cantidadProducto; i++) {
            pedirDatos();
            valorTotal = valorTotalP+valorTotal;
            System.out.println("cantidad a pagar es de: "+ productosMAp);
        }
        
        System.out.println();
        System.out.println("valor total: "+valorTotal);
    }

    public void pedirDatos() {
        Producto misProducto = new Producto();
        misProducto.llenarDatos();
        precioUnitario(misProducto);
        calcularValorP(misProducto);
        productosMAp.put(misProducto.getNombreProducto(),misProducto );        
    }

    private void calcularValorP(Producto misProducto) {
        valorTotalP = misProducto.getStockProducto()* misProducto.getPresioUnitario();
        System.out.println("el pago por "+misProducto.getNombreProducto()+" es: "+valorTotalP);
    }

    private void precioUnitario(Producto misProducto) {
        
        switch (misProducto.getProducto()) {
            case 1:
                misProducto.setPresioUnitario(100);
                misProducto.setNombreProducto("Papa");
                break;
            case 2:
                misProducto.setPresioUnitario(200);
                misProducto.setNombreProducto("Huevo");
                break;
            case 3:
                misProducto.setPresioUnitario(300);
                misProducto.setNombreProducto("tomate");
                break;
            case 4:
                misProducto.setPresioUnitario(400);
                misProducto.setNombreProducto("Pollo");
                break;
            default:
                System.out.println("no existe este producto");
                precioUnitario(misProducto);
        }
    }
}
