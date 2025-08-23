package app.domain.UseCase;

import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.service.PatientRegisty;

public class PatientsUseCase{
	private PatientRegisty patientRegistry;
	
	public void createPatient(User user) throws Exception {
		user.setRole(Role.ADMINISTRATIVEPERSONNEL);
		PatientRegisty createPatients;

	}
	
}