package Homework_from_Roman.hw3;

public class CarShop {

    private Service service;
    private CarFactory carFactory;

    public CarShop(Service service, CarFactory carFactory) {
        this.service = service;
        this.carFactory = carFactory;
    }

    public Car orderCar(Car car, CarStorage carStorage) {
        if (car.getModel() == carStorage.car1.getModel() &&
                carStorage.car1.getYearOfIssue() == car.getYearOfIssue() &&
                carStorage.car1.getEngineVolume() == car.getEngineVolume()) {
            return carStorage.car1;
        } else if (car.getModel() == carStorage.car2.getModel() &&
                carStorage.car2.getYearOfIssue() == car.getYearOfIssue() &&
                carStorage.car2.getEngineVolume() == car.getEngineVolume()) {
            return carStorage.car2;
        } else {
            return car;
        }
    }
}
