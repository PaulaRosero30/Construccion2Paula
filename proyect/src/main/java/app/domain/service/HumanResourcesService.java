package app.domain.service;

import app.domain.model.PersonClass;

import javax.swing.JOptionPane;
import app.domain.model.PersonClass;
import app.domain.model.PersonRecord;

public class HumanResourcesService extends PersonRecord
{

    public void registerEmployee()
    {
        PersonClass _Pc_ = new PersonClass();

        _Pc_.setIdType(JOptionPane.showInputDialog("Ingrese el tipo de identificación: "));
        _Pc_.setIdNumber(JOptionPane.showInputDialog("Ingrese el número de identificación: "));
        _Pc_.setName(JOptionPane.showInputDialog("Ingrese los nombres completos: "));
        _Pc_.setLastName(JOptionPane.showInputDialog("Ingrese los apellidos completos: "));
        _Pc_.setGender(JOptionPane.showInputDialog("Ingrese el género con el que se identifique: "));
        _Pc_.setRelationshipClinic("Empleado");

        String profession = JOptionPane.showInputDialog("Ingrese la profesión del empleado: ");
        _Pc_.setPersonCategory(profession);

        _Pc_.setPersonJobTitle(JOptionPane.showInputDialog("Ingrese el área en la que se desempeña: "));

        if (profession.equals("Medicina"))
        {
        	
            _Pc_.setProfessionalLicenseNumber(JOptionPane.showInputDialog("Ingrese el número de licencia profesional: "));
            
        }
        
        fillPersonalData(_Pc_);
     
        String id = _Pc_.getIdNumber();
        String name = _Pc_.getName();
        String lastName = _Pc_.getLastName();

        String user = (name.substring(0,2) + lastName.substring(0,2) + id.substring(id.length()-4)).toLowerCase();
        if(user.length() > 8) user = user.substring(0,8);
        _Pc_.setUsername(user);

        String pass = (name.substring(0,3) + lastName.substring(0,3) + id.substring(id.length()-4) + (int)(Math.random()*9000+1000));
        if(pass.length() > 16) pass = pass.substring(0,16);
        _Pc_.setSecurityKey(pass);

        JOptionPane.showMessageDialog(null, "Empleado registrado correctamente.\nUsuario: " + user + "\nClave: " + pass);
        
    }
    
    public void deleteEmployee(String idNumber) {
        
        JOptionPane.showMessageDialog(null, "Empleado con ID " + idNumber + " eliminado correctamente.");
        
    }
	
}