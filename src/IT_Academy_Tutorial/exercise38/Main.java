package IT_Academy_Tutorial.exercise38;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Volkswagen");
        Motorcycle motorcycle = new Motorcycle("Ducati");

        Garage<Car> garage1 = new Garage<>(car);
        Garage<Motorcycle> garage2 = new Garage<>(motorcycle);

        System.out.println(garage1.getVehicle());
        System.out.println(garage2.getVehicle());

    }

}
