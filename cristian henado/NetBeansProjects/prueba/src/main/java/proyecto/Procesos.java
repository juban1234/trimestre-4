package proyecto;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SENA
 */
public final class Procesos {
    
    double valorPagoTotal = 0;
    ArrayList<Personas > personasList;
    HashMap<String,Personas > personasMapa;
    
    public Procesos(){
        personasList=new ArrayList<>();
        personasMapa= new HashMap<>();
        
        int cant = Integer.parseInt(JOptionPane.showInputDialog("cuantos empleados se ban aprocesar"));
        for (int i = 0; i < cant; i++) {
            pedirdatos();
        }
        System.out.println("el valor total que se debbe pagar a las empleados es de: "+valorPagoTotal);
        System.out.println();
        System.out.println(personasMapa);
        System.out.println();
        
        for (int i = 0; i < personasList.size(); i++) {
            System.out.println(personasList.get(i).getNombre());
        }
        
        System.out.println();
        
        for (Personas p : personasList) {
            System.out.println(p.getDocumento()+"-"+p.getNombre());
        }
        
        System.out.println();
        System.out.println(personasMapa);
    }

    
    public void pedirdatos() {
        Personas misPersonal = new Personas();
        misPersonal.llenarDatos();
        
        calcularBonoficacionDescunto(misPersonal);
        calcularPago(misPersonal);
        System.out.println(misPersonal);
        personasList.add(misPersonal);
        personasMapa.put(misPersonal.getDocumento(),misPersonal );
    }
    
    public void calcularPago(Personas misPersonas){
        double pago = misPersonas.getSalarioActual()+
                (misPersonas.getSalarioActual()*misPersonas.getBonificacion())-
                (misPersonas.getSalarioActual()-misPersonas.getDescuento());
        
        misPersonas.setValorPago(pago);
        valorPagoTotal = valorPagoTotal+misPersonas.getValorPago();
        System.out.println("hola "+misPersonas.getNombre()+"el pago final es: "+misPersonas.getValorPago());
        
    }

    private void calcularBonoficacionDescunto(Personas misPersonal) {
        switch (misPersonal.getCategoria()) {
            case 1 -> {
                misPersonal.setBonificacion(0.15);
                misPersonal.setDescuento(0.02);
            }
            case 2 -> {
                misPersonal.setBonificacion(0.10);
                misPersonal.setDescuento(0.015);
            }
            case 3 -> {
                misPersonal.setBonificacion(0.08);
                misPersonal.setDescuento(0.01);
            }
            case 4 -> {
                misPersonal.setBonificacion(0.0);
                misPersonal.setDescuento(0.0);
            }
            default -> System.out.println("La categoria no existe");
        }
    }
    
    
}
