package controller;

import model.PersonaDTO;
import model.Procesos;
import view.Ventana2;
import view.VentanaPrincipal;

public class Coordinador {

	private VentanaPrincipal miPrincipal;
	Ventana2 miVentana2;
	Procesos misProcesos;

	public void setVentanaPrincipal(VentanaPrincipal miPrincipal) {
		this.miPrincipal=miPrincipal;
	}

	public void setVentana2(Ventana2 miVentana2) {
		this.miVentana2=miVentana2;
	}

	public void setProcesos(Procesos misProcesos) {
		this.misProcesos=misProcesos;
	}

	public String calcularSalario(PersonaDTO miPersonaDTO) {
		
		return misProcesos.calcularSalario(miPersonaDTO);
	}

	public void mostrarVentana(int ventana) {
		switch (ventana) {
		case 1:miPrincipal.setVisible(true);
			
			break;
		case 2:miVentana2.setVisible(true);
		
		break;
		default:
			break;
		}
	}

}
