package ensayo;

public class RegistroPaciente {
	private static String idPaciente;
	private static String nombreCompleto;
	private static String apellidos;
	private static String fechaNacimiento;
	private static String genero;
	private static String direccion;
	private static String numeroTelefono;
	private static String correoElectronico;
	
	public void showData() {
		System.out.println("Documento del paciente: " + idPaciente);
		System.out.println("Ingrese el nombre completo del paciente: " +nombreCompleto);
		System.out.println("Ingrese los apellidos del paciente: " +apellidos);
		System.out.println("Ingrese la fecha de nacimiento del paciente: " +fechaNacimiento);
		System.out.println("Ingrese genero del paciente 'Femenino, masculino': " +genero);
		System.out.println("Ingrese la dirección del paciente: " +direccion);
		System.out.println("Ingrese el número de telefono del paciente: " +numeroTelefono);
		System.out.println("Ingrese el correo electronico del paciente: " +correoElectronico);

	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		RegistroPaciente.idPaciente = idPaciente;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	
}