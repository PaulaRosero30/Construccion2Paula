package ensayoservicios;

import ensayo.RegistroPaciente;
import java.util.*;

public class  Enfermeras {
	private List<RegistroPaciente> pacientes = new ArrayList<>();

    public void agregarPaciente(RegistroPaciente paciente) {
        pacientes.add(paciente);
    }


    public RegistroPaciente buscarPorId(String idPaciente) {
        for (RegistroPaciente p : pacientes) {
            if (p.getIdPaciente().equals(idPaciente)) {
                return p;
            }
        }
        return null;
    }


    public boolean existePaciente(String idPaciente) {
        return buscarPorId(idPaciente) != null;
    }
    
    
}