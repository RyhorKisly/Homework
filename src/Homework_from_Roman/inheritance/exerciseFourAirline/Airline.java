//Авиакомпания. Определить иерархию самолетов, вертолетов, квадрокоптеров и т.д.
//Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность.
//Провести сортировку летных средств компании по дальности полета.
//Найти самолет в компании, соответствующий заданному диапазону параметров.

package Homework_from_Roman.inheritance.exerciseFourAirline;

import java.util.*;

public class Airline implements Comparable<AirVehicle>{

    private AirVehicle[] airVehicle;
    private TreeSet<? super AirVehicle> airLine;
    private AirVehicle airVehicles;

    public Airline(AirVehicle... airVehicle) {
        this.airVehicle = airVehicle;
    }

//    @Override
//    public int compareTo(AirVehicle airVehicle) {
//        return 0;
//    }
    @Override
    public int compareTo(AirVehicle airVehicle) {
        return airVehicles.getRangeOfFlight() - airVehicle.getRangeOfFlight();
    }

    public int getTotalCapacityOfAirLine() {
        int CapacityOfAirLine = 0;
        while (CapacityOfAirLine < airVehicle.length) {
            CapacityOfAirLine++;
        }
        return CapacityOfAirLine;
    }

    public int getTotalLoadCapacity() {
        int sumOfLoadCapacity = 0;
        for(int i = 0; i < airVehicle.length; i++) {
            sumOfLoadCapacity += airVehicle[i].getLoadCapacity();
        }
        return sumOfLoadCapacity;
    }



    public void sortByDistance() {
        List<AirVehicle> vehicles = new ArrayList<>();
        vehicles.addAll(Arrays.asList(airVehicle));
        Collections.sort(vehicles);
    }

//    public TreeMap<? super AirVehicle> getAirLine() {
//        return airLine;
//    }
}
