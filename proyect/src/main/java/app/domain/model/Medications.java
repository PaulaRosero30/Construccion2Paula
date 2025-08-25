package app.domain.model;

public class Medications {
    private String name;
    private String medicalOrderId;
    private String itemId;

    public Medications() {}

    public Medications(String name, String medicalOrderId, String itemId) {
        this.name = name;
        this.medicalOrderId = medicalOrderId;
        this.itemId = itemId;
    }
}