package ensayo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ensayointerfaz.Resultado;
import ensayo.RegistroPaciente;

public class Menu2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Resultado resultado = new Resultado();
        
        boolean salir = false;

        while (!salir) {
            MostrarMenu();
            int opcion = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer

            switch (opcion) {
            	case 1 -> resultado.registrarPacientes();
                case 2 -> resultado.buscarPaciente();
                case 3 -> {
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                }
                default -> System.out.println("Opción no válida, intente nuevamente.");
            }
        }

        teclado.close();
    }

    private static void MostrarMenu() {
        System.out.println("\n*** Listado De Personas ***");
        System.out.println("""
                1. Registrar paciente
                2. Buscar paciente
                3. Salir
                """);
        System.out.print("Seleccione su opción: ");
    }
}