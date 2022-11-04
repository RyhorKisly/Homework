package Homework_from_Roman.extra.inheritance.exerciseFifePublicTransport;

public class PublicTransport implements Comparable<PublicTransport>{

    private String name;
    private int fuelConsumption;
    private int cost;

    public PublicTransport(String name, int fuelConsumption, int cost) {
        this.name = name;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int compareTo(PublicTransport publicTransport) {
        return this.fuelConsumption - publicTransport.fuelConsumption;
    }
}

