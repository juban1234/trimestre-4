/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author SENA
 */

public class Procesos {
    ModeloDatos miModeloDatos = new ModeloDatos();
    

    public Procesos() {
        PersonaDTO miPersonaDto = null;

        for(int i = 0; i < 3; ++i) {
            miPersonaDto = this.registrarPersona();
            this.calcularPromedio(miPersonaDto);
            System.out.println();
        }

        System.out.println(this.miModeloDatos.consultarPersona(111));
    }

    private PersonaDTO registrarPersona() {
        PersonaDTO miPersonaDto = new PersonaDTO();
        this.miModeloDatos.insert(miPersonaDto);
        return miPersonaDto;
    }

    private void calcularPromedio(PersonaDTO miP) {
        double prom = (miP.getNota1() + miP.getNota2() + miP.getNota3()) / 3.0;
        miP.setPromedio(prom);
        System.out.println(miP);
        if (miP.getPromedio() >= 3.5) {
            System.out.println("GANA LA MATERIA");
        } else {
            System.out.println("PIERDE LA MATERIA");
        }

    }
}

