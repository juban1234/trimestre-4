package controller;
import model.Procesos;
import view.Ventana2;
import view.VentanaPrincipal;

public class Principal {

	public static void main(String[] args) {
		VentanaPrincipal miPrincipal=new VentanaPrincipal();
		Ventana2 miVentana2=new Ventana2();
		Procesos misProcesos=new Procesos();
		Coordinador miCoordinador=new Coordinador();
		
		
		miPrincipal.setCoordiandor(miCoordinador);
		miVentana2.setCoordinador(miCoordinador);
		misProcesos.setCoordinador(miCoordinador);
		
		
		miCoordinador.setVentanaPrincipal(miPrincipal);
		miCoordinador.setVentana2(miVentana2);
		miCoordinador.setProcesos(misProcesos);
		
		miCoordinador.mostrarVentana(1);
	}

}
