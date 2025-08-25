package app.domain.model;

public class PersonClass 
{

	private String idType, idNumber, name, lastName, Gender, relationshipClinic, personCategory, personJobTitle, professionalLicenseNumber;
	private String bloodType, birthDate, maritalStatus, personAddress, phoneNumber, email, username, securityKey;
	private String emergencyContactFullName, relationshipPatient, emergencyPhoneNumber;
	private String allergies, medicalConditions, insuranceCompany, policyNumber, policyEndDate, attendingDoctorName;
	private String medications, procedures, diagnosticTests;
	private boolean policyState;

	public void showData()
	{
		
	    System.out.println("Datos de Registro" + "\n");
	    System.out.println("Tipo de Identificación: " + idType + "\n");
	    System.out.println("Número de Identificación: " + idNumber + "\n");
	    System.out.println("Nombre: " + name + " " + lastName + "\n");
	    System.out.println("Género: " + Gender + "\n");
	    System.out.println("Relación con la Clínica: " + relationshipClinic + "\n");
	    System.out.println("Categoría del Empleado: " + personCategory + "\n");
	    System.out.println("Cargo que desempeña el Empleado: " + personJobTitle + "\n");
	    System.out.println("Número de Licencia Profesional: " + professionalLicenseNumber + "\n");
	    System.out.println("Tipo de Sangre: " + bloodType + "\n");
	    System.out.println("Fecha de Nacimiento: " + birthDate + "\n");
	    System.out.println("Estado Civil: " + maritalStatus + "\n");
	    System.out.println("Dirección: " + personAddress + "\n");
	    System.out.println("Teléfono: " + phoneNumber + "\n");
	    System.out.println("Correo Electrónico: " + email + "\n");
	    System.out.println("Usuario: " + username + "\n");
	    System.out.println("Clave de Seguridad: " + securityKey + "\n");
	    System.out.println("Contacto de Emergencia: " + emergencyContactFullName + "\n");
	    System.out.println("Relación con el Paciente: " + relationshipPatient + "\n");
	    System.out.println("Teléfono de Emergencia: " + emergencyPhoneNumber + "\n");
	    System.out.println("Alergias: " + allergies + "\n");
	    System.out.println("Condiciones Médicas: " + medicalConditions + "\n");
	    System.out.println("Compañía de Seguro: " + insuranceCompany + "\n");
	    System.out.println("Número de Póliza: " + policyNumber  + "\n");
	    System.out.println("Estado de Póliza: " + (policyState ? "Activa" : "Inactiva") + "\n");
	    System.out.println("Vigencia de la Póliza: " + policyEndDate + "\n");
	    System.out.println("Médico tratante: " + attendingDoctorName + "\n");
        System.out.println("Medicamentos aplicados: " + medications + "\n");
        System.out.println("Procedimientos realizados: " + procedures + "\n");
        System.out.println("Exámenes diagnósticos: " + diagnosticTests + "\n");
		
	}
	
	//----------------------------------------------

	public void setIdType(String idType)
	{
	    this.idType = idType;
	}

	public void setIdNumber(String idNumber)
	{
	    this.idNumber = idNumber;
	}

	public void setName(String name)
	{
	    this.name = name;
	}

	public void setLastName(String lastName)
	{
	    this.lastName = lastName;
	}

	public void setGender(String gender)
	{
	    this.Gender = gender;
	}

	public void setRelationshipClinic(String relationshipClinic)
	{
	    this.relationshipClinic = relationshipClinic;
	}

	public void setPersonCategory(String personCategory)
	{
	    this.personCategory = personCategory;
	}

	public void setPersonJobTitle(String personJobTitle)
	{
	    this.personJobTitle = personJobTitle;
	}

	public void setProfessionalLicenseNumber(String professionalLicenseNumber)
	{
	    this.professionalLicenseNumber = professionalLicenseNumber;
	}

	public void setBloodType(String bloodType)
	{
	    this.bloodType = bloodType;
	}

	public void setBirthDate(String birthDate)
	{
	    this.birthDate = birthDate;
	}

	public void setMaritalStatus(String maritalStatus)
	{
	    this.maritalStatus = maritalStatus;
	}

	public void setPersonAddress(String personAddress)
	{
	    this.personAddress = personAddress;
	}

	public void setPhoneNumber(String phoneNumber)
	{
	    this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email)
	{
	    this.email = email;
	}

	public void setUsername(String username)
	{
	    this.username = username;
	}

	public void setSecurityKey(String securityKey)
	{
	    this.securityKey = securityKey;
	}

	public void setEmergencyContactFullName(String emergencyContactFullName)
	{
	    this.emergencyContactFullName = emergencyContactFullName;
	}

	public void setRelationshipPatient(String relationshipPatient)
	{
	    this.relationshipPatient = relationshipPatient;
	}

	public void setEmergencyPhoneNumber(String emergencyPhoneNumber)
	{
	    this.emergencyPhoneNumber = emergencyPhoneNumber;
	}

	public void setAllergies(String allergies)
	{
	    this.allergies = allergies;
	}

	public void setMedicalConditions(String medicalConditions)
	{
	    this.medicalConditions = medicalConditions;
	}
	
    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setPolicyState(boolean policyState) {
        this.policyState = policyState;
    }

    public void setPolicyEndDate(String policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

    public void setAttendingDoctorName(String attendingDoctorName) {
        this.attendingDoctorName = attendingDoctorName;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public void setProcedures(String procedures) {
        this.procedures = procedures;
    }

    public void setDiagnosticTests(String diagnosticTests) {
        this.diagnosticTests = diagnosticTests;
    }
		
	public String getIdType()
	{
	    return idType;
	}

	public String getIdNumber()
	{
	    return idNumber;
	}

	public String getName()
	{
	    return name;
	}

	public String getLastName()
	{
	    return lastName;
	}

	public String getGender()
	{
	    return Gender;
	}

	public String getRelationshipClinic()
	{
	    return relationshipClinic;
	}

	public String getPersonCategory()
	{
	    return personCategory;
	}

	public String getPersonJobTitle()
	{
	    return personJobTitle;
	}

	public String getProfessionalLicenseNumber()
	{
	    return professionalLicenseNumber;
	}

	public String getBloodType()
	{
	    return bloodType;
	}

	public String getBirthDate()
	{
	    return birthDate;
	}

	public String getMaritalStatus()
	{
	    return maritalStatus;
	}

	public String getPersonAddress()
	{
	    return personAddress;
	}

	public String getPhoneNumber()
	{
	    return phoneNumber;
	}

	public String getEmail()
	{
	    return email;
	}

	public String getUsername()
	{
	    return username;
	}

	public String getSecurityKey()
	{
	    return securityKey;
	}

	public String getEmergencyContactFullName()
	{
	    return emergencyContactFullName;
	}

	public String getRelationshipPatient()
	{
	    return relationshipPatient;
	}

	public String getEmergencyPhoneNumber()
	{
	    return emergencyPhoneNumber;
	}

	public String getAllergies()
	{
	    return allergies;
	}

	public String getMedicalConditions()
	{
	    return medicalConditions;
	}
	
	public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public boolean getPolicyState() {
        return policyState;
    }

    public String getPolicyEndDate() {
        return policyEndDate;
    }

    public String getAttendingDoctorName() {
        return attendingDoctorName;
    }

    public String getMedications() {
        return medications;
    }

    public String getProcedures() {
        return procedures;
    }

    public String getDiagnosticTests() {
        return diagnosticTests;
    }
	
}
