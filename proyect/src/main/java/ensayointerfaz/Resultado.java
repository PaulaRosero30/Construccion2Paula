package ensayointerfaz;

import ensayo.RegistroPaciente;
import ensayoservicios.Enfermeras;
import java.util.Scanner;

public class Resultado {

    private Scanner sc = new Scanner(System.in);
    private Enfermeras enfermera = new Enfermeras();


    public void registrarPacientes() {
        System.out.print("¿Cuántos pacientes desea registrar? " + "\n");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            RegistroPaciente paciente = new RegistroPaciente();

            System.out.println("\n--- Registro del paciente " + (i + 1) + " ---");
            System.out.print("Ingrese el documento del paciente: ");
            paciente.setIdPaciente(sc.nextLine());

            System.out.print("Ingrese el nombre completo: ");
            paciente.setNombreCompleto(sc.nextLine());

            System.out.print("Ingrese los apellidos: ");
            paciente.setApellidos(sc.nextLine());

            System.out.print("Ingrese la fecha de nacimiento: ");
            paciente.setFechaNacimiento(sc.nextLine());

            System.out.print("Ingrese el género (Femenino/Masculino): ");
            paciente.setGenero(sc.nextLine());

            System.out.print("Ingrese la dirección: ");
            paciente.setDireccion(sc.nextLine());

            System.out.print("Ingrese el número de teléfono: ");
            paciente.setNumeroTelefono(sc.nextLine());

            System.out.print("Ingrese el correo electrónico: ");
            paciente.setCorreoElectronico(sc.nextLine());

            System.out.println("\nPaciente registrado");


            enfermera.agregarPaciente(paciente);
        }
    }


    public void buscarPaciente() {
        System.out.print("\nIngrese un ID de paciente para buscar: ");
        String idBuscado = sc.nextLine();

        RegistroPaciente encontrado = enfermera.buscarPorId(idBuscado);
        if (encontrado != null) {
            System.out.println("\nPaciente encontrado:");
            encontrado.showData();
           
        } else {
            System.out.println("\nNo existe un paciente con ese ID.");
        
        }
    }
}
