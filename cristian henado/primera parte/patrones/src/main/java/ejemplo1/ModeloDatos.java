/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author SENA
 */
import java.util.HashMap;

public class ModeloDatos {
    HashMap<Integer, PersonaDTO> mapPersonas = new HashMap();

    public ModeloDatos() {
    }

    public void insert(PersonaDTO miPersona) {
        this.mapPersonas.put(miPersona.getId(), miPersona);
        System.out.println("Persona registrada: " + miPersona.getNombre());
    }

    public PersonaDTO consultarPersona(int id) {
        return (PersonaDTO)this.mapPersonas.get(id);
    }
}
