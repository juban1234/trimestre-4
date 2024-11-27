package model;

import controller.Coordinador;

public class Procesos {
   

    private Coordinador miCoordinador;

	public String calcularSalario(PersonaDTO miDto) {
        double salarioFinal = miDto.getSalario();

        if (miDto.getTipo() == 1) {
            salarioFinal += miDto.getSalario() * 0.10;
        } else if (miDto.getTipo() == 2) {
            salarioFinal += miDto.getSalario() * 0.20;
        }

        return "Empleado: " + miDto.getNombre() + "\nDirección: " + miDto.getDireccion() + "\nTeléfono: " + miDto.getTelefono() + 
               "\nSalario Ajustado: $" + salarioFinal;
    }

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}
}
