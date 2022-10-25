package Homework_from_Roman.hw3;

public class CarShop {

    private Service service;
    private CarFactory carFactory;

    public CarShop(Service service, CarFactory carFactory) {
        this.service = service;
        this.carFactory = carFactory;
    }

    public void orderCar(CarFactory carFactory) {
        return carFactory.createCar();
    }

}
