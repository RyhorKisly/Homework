package Homework_from_Roman.inheritance.exerciseFourAirline;

public class Helicopter extends AirVehicle {

    private int numberOfVints;

    public Helicopter(String typeOfVehicle, Integer loadCapacity, Integer rangeOfFlight) {
        super(typeOfVehicle, loadCapacity, rangeOfFlight);
    }

    public int getNumberOfVints() {
        return numberOfVints;
    }

    public void setNumberOfVints(int numberOfVints) {
        this.numberOfVints = numberOfVints;
    }
}
