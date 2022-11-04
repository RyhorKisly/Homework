package Homework_from_Roman.extra.inheritance.exerciseFourAirline;

public class Dirigible extends AirVehicle{

    private Integer ValueOfBalloon;

    public Dirigible(String typeOfVehicle, Integer loadCapacity, Integer rangeOfFlight) {
        super(typeOfVehicle, loadCapacity, rangeOfFlight);
    }

    public Integer getValueOfBalloon() {
        return ValueOfBalloon;
    }

    public void setValueOfBalloon(Integer valueOfBalloon) {
        ValueOfBalloon = valueOfBalloon;
    }
}
