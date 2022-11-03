//Авиакомпания. Определить иерархию самолетов, вертолетов, квадрокоптеров и т.д.
//Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность.
//Провести сортировку летных средств компании по дальности полета.
//Найти самолет в компании, соответствующий заданному диапазону параметров.

package Homework_from_Roman.inheritance.exerciseFourAirline;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class Airline {

    private AirVehicle[] airVehicle;
    private TreeMap<Integer, ? super AirVehicle> airLine;

    public Airline(TreeMap<Integer, ? super AirVehicle> treeMap, AirVehicle... airVehicle) {
        this.airLine =  treeMap;
        this.airVehicle = airVehicle;
        int key = 1;
        for(int i = 0; i < airVehicle.length; i++) {
            airLine.put(airVehicle[i].getRangeOfFlight(), airVehicle[i]);
            System.out.println(airVehicle[i]);
        }
    }
    public void getNumberOfAirVehicles(TreeMap<Integer, ? super AirVehicle> treeMap) {
        Integer capacity = 0;
        Set<Integer> keys = (Set<Integer>) treeMap.keySet();
        for(Integer element : keys) {
            capacity++;
        }
        System.out.println("Общая вместимость авиокомпании: " + capacity);
    }

    public TreeMap<Integer, ? super AirVehicle> getAirLine() {
        return airLine;
    }
}
