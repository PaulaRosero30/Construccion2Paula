package ensayo;

public class Menu2 {
	public void mostrarMenu() {
	    System.out.println("\n=== Datos adicionales ===");
	    System.out.println("1. Datos vitales del paciente");
	    System.out.println("2. Actualizar información");
	    System.out.println("3. Salir");
	    System.out.print("Elija una opción: ");

	    String opcion = sc.nextLine();

	    switch (opcion) {
	        case "1":
	            registrarPaciente();
	            break;
	        case "2":
	            buscarPaciente();
	            break;
	        case "3":
	            System.out.println("Saliendo del sistema...");
	            return; // Termina el programa
	        default:
	            System.out.println("Opción inválida.");
	            mostrarMenu(); // vuelve a mostrar menú
	    }
	}
}
