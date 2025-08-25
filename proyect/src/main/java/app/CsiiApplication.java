package app;

import javax.swing.JOptionPane;

import app.domain.model.Patients;
import app.domain.model.PersonRecord;

/*
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

*/

public class CsiiApplication
{

	public static void main(String[] args)
	{
		
//		SpringApplication.run(CsiiApplication.class, args);
		
				Patients patient = new Patients();
				
				
		        patient.setIdType("CC");
		        patient.setIdNumber("123456789");
		        patient.setName("Carlos");
		        patient.setLastName("Ramírez");
		        patient.setGender("Masculino");
		        patient.setPhoneNumber("555-1234");
		        patient.setEmail("carlos.ramirez@mail.com");

		        patient.setIdPatients(1L);
		        patient.setFullName("Carlos Ramírez");

				
				patient.showData();
				
				System.out.println("ID Paciente: " + patient.getIdPatients());

			}
			
			
		
	}


