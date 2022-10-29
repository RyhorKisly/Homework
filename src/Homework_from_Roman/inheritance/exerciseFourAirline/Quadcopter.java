package Homework_from_Roman.inheritance.exerciseFourAirline;

public class Quadcopter extends AirVehicle {

    private Integer numberOfMotors;

    public Quadcopter(String typeOfVehicle, Integer loadCapacity, Integer rangeOfFlight) {
        super(typeOfVehicle, loadCapacity, rangeOfFlight);
    }

    public Integer getNumberOfMotors() {
        return numberOfMotors;
    }

    public void setNumberOfMotors(Integer numberOfMotors) {
        this.numberOfMotors = numberOfMotors;
    }
}
