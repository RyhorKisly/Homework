//Авиакомпания. Определить иерархию самолетов, вертолетов, квадрокоптеров и т.д.
//Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность.
//Провести сортировку летных средств компании по дальности полета.
//Найти самолет в компании, соответствующий заданному диапазону параметров.

package Homework_from_Roman.inheritance.exerciseFourAirline;

import java.util.*;

public class Airline {

    private AirVehicle[] airVehicle;
    private AirVehicle airVehicles;

    public Airline(AirVehicle... airVehicle) {
        this.airVehicle = airVehicle;
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
        for(AirVehicle  p : vehicles){
            System.out.println(p.getTypeOfVehicle() +
                    ": имеет следующую дальность полёта: " + p.getRangeOfFlight() + " км.");
        }
    }



}
