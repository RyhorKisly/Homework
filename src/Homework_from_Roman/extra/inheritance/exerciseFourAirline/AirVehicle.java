package Homework_from_Roman.extra.inheritance.exerciseFourAirline;

public class AirVehicle implements Comparable<AirVehicle> {

    private String typeOfVehicle;
    private Integer loadCapacity;
    private Integer rangeOfFlight;

    public AirVehicle(String typeOfVehicle, Integer loadCapacity, Integer rangeOfFlight) {
        this.typeOfVehicle = typeOfVehicle;
        this.loadCapacity = loadCapacity;
        this.rangeOfFlight = rangeOfFlight;
    }

    @Override
    public int compareTo(AirVehicle airVehicle) {
        return this.rangeOfFlight - airVehicle.getRangeOfFlight();
    }


    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public Integer getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Integer loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Integer getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setRangeOfFlight(Integer rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    @Override
    public String toString() {
        return "AirVehicle{" +
                "typeOfVehicle='" + typeOfVehicle + '\'' +
                ", loadCapacity=" + loadCapacity +
                ", rangeOfFlight=" + rangeOfFlight +
                '}';
    }
}
