package nurseservices;

import test.PatientRegistration;
import java.util.*;

public class Nurses {
    private List<PatientRegistration> patients = new ArrayList<>();

    public void addPatient(PatientRegistration patient) {
        patients.add(patient);
    }

    public PatientRegistration findById(String patientId) {
        for (PatientRegistration p : patients) {
            if (p.getPatientId().equals(patientId)) {
                return p;
            }
        }
        return null;
    }

    public boolean patientExists(String patientId) {
        return findById(patientId) != null;
    }
}
