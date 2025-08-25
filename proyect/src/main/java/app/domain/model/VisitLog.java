package app.domain.model;

import java.time.LocalDateTime;
import java.util.List;

public class VisitLog {
	    private Long id;
	    private Long idPatient;
	    private Long idNurse;
	    private LocalDateTime visitDate;

	    private VitalSigns vitalSigns;
	    private List<Medications> medications;
	    private List<Procedure> procedure ;
	    private List<Labs> labs;
	    private String observations;


	    public VisitLog() {}


	    public VisitLog(Long idPatient,
	                          Long idNurse,
	                          LocalDateTime visitDate,
	                          VitalSigns vitalSigns,
	                          List<Medications> medications,
	                          List<Procedure> procedure,
	                          List<Labs> labs,
	                          String observations) {
	        this.idPatient = idPatient;
	        this.idNurse = idNurse;
	        this.visitDate = visitDate;
	        this.vitalSigns = vitalSigns;
	        this.medications = medications;
	        this.procedure  = procedure ;
	        this.labs = labs;
	        this.observations = observations;
	    }

}

