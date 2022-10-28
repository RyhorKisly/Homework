package IT_Academy_Tutorial.exercise38;

public class Garage<T extends Vehicle> {

    T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }

}
