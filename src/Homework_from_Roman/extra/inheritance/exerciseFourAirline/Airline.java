//Авиакомпания. Определить иерархию самолетов, вертолетов, квадрокоптеров и т.д.
//Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность.
//Провести сортировку летных средств компании по дальности полета.
//Найти самолет в компании, соответствующий заданному диапазону параметров.

package Homework_from_Roman.extra.inheritance.exerciseFourAirline;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Airline {

    private AirVehicle[] airVehicle;

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

    //Найти самолет в компании, соответствующий заданному диапазону параметров.
    public void findAirVehiclesCorrespondingToLoadCapacity(int firstValue, int lastValue) {
        try {
        int i = 0;
        Pattern p = Pattern.compile("Самолёт");
        List<AirVehicle> vehicles = new ArrayList<>();
        vehicles.addAll(Arrays.asList(airVehicle));
        Collections.sort(vehicles);
        System.out.println("Самолёты, соответствующие заданному диапазоны:");
        for(AirVehicle  f : vehicles){
            Matcher m = p.matcher(f.getTypeOfVehicle());
            if (firstValue <= f.getLoadCapacity() && lastValue >= f.getLoadCapacity() && m.find()) {
                System.out.println(f.getTypeOfVehicle() + ", " + "грузоподъёмность: " + f.getLoadCapacity() + " кг.");
                i++;
            }
        }
            if(i == 0) {
                throw new Exception("Нет Самолётов, соответствующих заданному параметру");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

}
