// Авиакомпания. Определить иерархию самолетов, вертолетов, квадрокоптеров и т.д.
// Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность.
// Провести сортировку летных средств компании по дальности полета.
// Найти самолет в компании, соответствующий заданному диапазону параметров.

package Homework_from_Roman.inheritance.exerciseFourAirline;

import Homework_from_Roman.inheritance.exerciseThreeAppliance.Room;

import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Boeing boeing = new Boeing("Самолёт - боинг", 10000, 8000);
        Dirigible dirigible = new Dirigible("Дерижабль", 3000, 6000);
        Fighter fighter = new Fighter("Самолёт - истребитель", 1000, 4000);
        Helicopter helicopter = new Helicopter("Вертолёт", 1900, 2000);
        Quadcopter quadcopter = new Quadcopter("Квадрокоптер", 100, 300);
        TreeMap<Integer, ? super AirVehicle> airLines = new TreeMap<>();

        Airline airline = new Airline(airLines);
        airline.createAirLine(boeing, dirigible, fighter, helicopter, quadcopter);
        Set<Integer> keys = airline.getAirLine().keySet();

    }


}

