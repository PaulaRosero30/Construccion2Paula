package testinterface;

import test.PatientRegistration;
import nurseservices.Nurses;
import java.util.Scanner;

public class Result {

    private Scanner sc = new Scanner(System.in);
    private Nurses nurse = new Nurses();

    public void registerPatients() {
        System.out.print("¿Cuántos pacientes desea registrar?" + "\n");
        int amount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < amount; i++) {
            PatientRegistration patient = new PatientRegistration();

            System.out.println("\n--- Registro del paciente " + (i + 1) + " ---");
            System.out.print("Ingrese el documento del paciente: ");
            patient.setPatientId(sc.nextLine());

            System.out.print("Ingrese el nombre completo: ");
            patient.setFullName(sc.nextLine());

            System.out.print("Ingrese los apellidos: ");
            patient.setLastName(sc.nextLine());

            System.out.print("Ingrese la fecha de nacimiento: ");
            patient.setBirthDate(sc.nextLine());

            System.out.print("Ingrese el género (Femenino/Masculino): ");
            patient.setGender(sc.nextLine());

            System.out.print("Ingrese la dirección: ");
            patient.setAddress(sc.nextLine());

            System.out.print("Ingrese el número de teléfono: ");
            patient.setPhoneNumber(sc.nextLine());

            System.out.print("Ingrese el correo electrónico: ");
            patient.setEmail(sc.nextLine());

            System.out.println("\nPaciente registrado!");

            nurse.addPatient(patient);
        }
    }

    public void searchPatient() {
        System.out.print("\nIngrese un ID de paciente para buscar: ");
        String searchedId = sc.nextLine();

        PatientRegistration found = nurse.findById(searchedId);
        if (found != null) {
            System.out.println("\nPaciente encontrado: ");
            found.showData();
        } else {
            System.out.println("\nNo existe un paciente con ese ID.");
        }
    }
}
