package app.domain.model;

public class VitalSigns {
	private String bloodPressure;
    private Double temperature;
    private Integer pulse;
    private Integer oxygenLevel;

    public VitalSigns() {}

    public VitalSigns(String bloodPressure, Double temperature, Integer pulse, Integer oxygenLevel) {
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        this.pulse = pulse;
        this.oxygenLevel = oxygenLevel;
    }

}