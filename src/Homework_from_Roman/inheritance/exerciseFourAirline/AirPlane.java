package Homework_from_Roman.inheritance.exerciseFourAirline;

public class AirPlane extends AirVehicle {

    private Integer numberOfEngines;

    public AirPlane(String typeOfVehicle, Integer loadCapacity, Integer rangeOfFlight) {
        super(typeOfVehicle, loadCapacity, rangeOfFlight);
    }

    public Integer getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(Integer numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }
}
