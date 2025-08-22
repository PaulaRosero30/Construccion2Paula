package app.domain.model;

import java.sql.Date;


public class MedicalHistory {

	private Date fecha;
	private Long idMedico;
	private String reasonVisit;
	private String symptoms;
	private String diagnosis;
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Long getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Long idMedico) {
		this.idMedico = idMedico;
	}
	public String getReasonVisit() {
		return reasonVisit;
	}
	public void setReasonVisit(String reasonVisit) {
		this.reasonVisit = reasonVisit;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	
}
