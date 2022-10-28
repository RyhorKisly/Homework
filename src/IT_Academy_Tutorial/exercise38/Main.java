// Создать классы Car и Motocycle, ктороые наследуются от общего класса
// Vehicle. Создать пле тфьу в классу Vehicle и проинициализировать его через
// конструктора. Создать generic класс Garage, который может хранить только объекты
// типа наследуемого от Vehicle. Создать 2 объекта класса Garage (все поля ввести с
// клавиатуры) и вывести на экран имя хранимого транспортного средства.

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
