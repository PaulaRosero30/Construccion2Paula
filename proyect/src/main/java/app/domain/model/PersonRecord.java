package app.domain.model;

import javax.swing.JOptionPane;

public class PersonRecord {

    protected void fillPersonalData(PersonClass _Pc_)
    {
    	
        _Pc_.setBloodType(JOptionPane.showInputDialog("Ingrese el tipo de sangre: "));
        _Pc_.setBirthDate(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (DD/MM/YYYY): "));
        _Pc_.setMaritalStatus(JOptionPane.showInputDialog("Ingrese el estado civil: "));
        _Pc_.setPersonAddress(JOptionPane.showInputDialog("Ingrese la dirección de residencia: "));
        _Pc_.setPhoneNumber(JOptionPane.showInputDialog("Ingrese el número de teléfono: "));
        _Pc_.setEmail(JOptionPane.showInputDialog("Ingrese el correo electrónico: "));
        _Pc_.setEmergencyContactFullName(JOptionPane.showInputDialog("Ingrese el contacto de emergencia: "));
        _Pc_.setRelationshipPatient(JOptionPane.showInputDialog("Relación con el contacto de emergencia: "));
        _Pc_.setEmergencyPhoneNumber(JOptionPane.showInputDialog("Teléfono del contacto de emergencia: "));
        _Pc_.setAllergies(JOptionPane.showInputDialog("¿Tiene alergias?: "));
        _Pc_.setMedicalConditions(JOptionPane.showInputDialog("¿Condiciones médicas?: "));
        
    }
    
}
