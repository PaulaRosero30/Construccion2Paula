package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import testinterface.Result;

public class MenuEmpleados {

	public class MenuEmpleado {
	    public static void main(String[] args) {
	        Scanner keyboard = new Scanner(System.in);
	        Result result = new Result();
	        
	        boolean exit = false;

	        while (!exit) {
	            showMenu();
	            int option = keyboard.nextInt();
	            keyboard.nextLine(); 

	            switch (option) {
	                case 1 -> result.registerPatients();
	                case 2 -> result.searchPatient();
	                case 3 -> {
	                    System.out.println("Saliendo del sistema...");
	                    exit = true;
	                }
	                default -> System.out.println("Opción no válida, intente nuevamente.");
	            }
	        }

	        keyboard.close();
	    }

	    private static void showMenu() {
	        System.out.println("\n***Listado De Personas***");
	        System.out.println("""
	                1. Medico
	                2. Enfermera
	                3. Salir
	                """);
	        System.out.print("Seleccione su opción: ");
	    }
	}
}
