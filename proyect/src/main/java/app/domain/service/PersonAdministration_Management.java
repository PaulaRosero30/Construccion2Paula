package app.domain.service;

import javax.swing.JOptionPane;
import app.domain.model.PersonClass;
import app.domain.model.PersonRecord;

public class PersonAdministration_Management extends PersonRecord
{
	
    public void registerPatient()
    {
    	
        PersonClass _Pc_ = new PersonClass();

        _Pc_.setIdNumber(JOptionPane.showInputDialog("Número de identificación:"));
        _Pc_.setName(JOptionPane.showInputDialog("Nombre completo:"));
        _Pc_.setBirthDate(JOptionPane.showInputDialog("Fecha de nacimiento (DD/MM/YYYY):"));
        _Pc_.setGender(JOptionPane.showInputDialog("Género (Masculino/Femenino/Otro):"));
        _Pc_.setPersonAddress(JOptionPane.showInputDialog("Dirección:"));
        _Pc_.setPhoneNumber(JOptionPane.showInputDialog("Número de teléfono (10 dígitos):"));
        _Pc_.setEmail(JOptionPane.showInputDialog("Correo electrónico:"));
        
        fillPersonalData(_Pc_);

        _Pc_.setEmergencyContactFullName(JOptionPane.showInputDialog("Nombre completo del contacto de emergencia:"));
        _Pc_.setRelationshipPatient(JOptionPane.showInputDialog("Relación con el paciente:"));
        _Pc_.setEmergencyPhoneNumber(JOptionPane.showInputDialog("Teléfono del contacto de emergencia (10 dígitos):"));

        _Pc_.setInsuranceCompany(JOptionPane.showInputDialog("Nombre de la compañía de seguros:"));
        _Pc_.setPolicyNumber(JOptionPane.showInputDialog("Número de póliza:"));
        String policyState = JOptionPane.showInputDialog("¿La póliza está activa? (true/false):");
        _Pc_.setPolicyState(Boolean.parseBoolean(policyState));
        _Pc_.setPolicyEndDate(JOptionPane.showInputDialog("Fecha de finalización de la póliza (DD/MM/YYYY):"));

        _Pc_.setAttendingDoctorName(JOptionPane.showInputDialog("Nombre del médico tratante:"));
        _Pc_.setMedications(JOptionPane.showInputDialog("Medicamentos aplicados (si aplica):"));
        _Pc_.setProcedures(JOptionPane.showInputDialog("Procedimientos realizados (si aplica):"));
        _Pc_.setDiagnosticTests(JOptionPane.showInputDialog("Exámenes diagnósticos aplicados (si aplica):"));

        JOptionPane.showMessageDialog(null, "Paciente registrado correctamente.");
        
    }

    public void generateInvoice(PersonClass _Pc_)
    {
    	
        String invoice = "FACTURA - CLÍNICA\n\n" +
                         "Paciente: " + _Pc_.getName() + "\n" +
                         "Cédula: " + _Pc_.getIdNumber() + "\n" +
                         "Edad: (calcular con fecha de nacimiento)\n\n" +
                         "Médico tratante: " + _Pc_.getAttendingDoctorName() + "\n" +
                         "Compañía de seguros: " + _Pc_.getInsuranceCompany() + "\n" +
                         "Número de póliza: " + _Pc_.getPolicyNumber() + "\n" +
                         "Vigencia: hasta " + _Pc_.getPolicyEndDate() + "\n\n" +
                         "Medicamentos: " + _Pc_.getMedications() + "\n" +
                         "Procedimientos: " + _Pc_.getProcedures() + "\n" +
                         "Exámenes: " + _Pc_.getDiagnosticTests() + "\n\n" +
                         "Copago: $50.000 (si aplica según reglas)\n";
 
        JOptionPane.showMessageDialog(null, invoice);
        
    }
}