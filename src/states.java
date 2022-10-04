public class states {
    
    private final String name;
    private String medicalStates;
    private String color;
    private String heartRate;

    public states (String name, String medicalStates, String color, String heartRate) {
        this.name = name;
        this.medicalStates = medicalStates;
        this.color = color;
        this.heartRate = heartRate;
    }

    public states (String name, String medicalStates) {
        this.name = name;
        this.medicalStates = medicalStates;
    }

    public states (String name, String medicalStates, String heartRate) {
        this.name = name;
        this.medicalStates = medicalStates;
        this.heartRate = heartRate;
    }

    public String getName () {
        return this.name;
    }

    public void setMedicalStates (String medicalStates) {
        this.medicalStates = medicalStates;
    }

    public String getMedicalStates () {
        return this.medicalStates;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public String getColor () {
        return this.color;
    }

    public void setHeartRate (String heartRate) {
        this.heartRate = heartRate;
    }

    public String getHeartRate () {
        return this.heartRate;
    }
}