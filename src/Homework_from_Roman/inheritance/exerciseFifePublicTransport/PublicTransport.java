package Homework_from_Roman.inheritance.exerciseFifePublicTransport;

public class PublicTransport {

    private String name;
    private String typeOfEngine;
    private int fuelConsumption;

    public PublicTransport(String name, String typeOfEngine, int fuelConsumption) {
        this.name = name;
        this.typeOfEngine = typeOfEngine;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
