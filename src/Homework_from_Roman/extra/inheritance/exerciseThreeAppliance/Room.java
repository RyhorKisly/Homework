// Определить иерархию домашней техники.
// Включить некоторые в розетку.
// Рассчитать потребляемую мощность.
// Провести сортировку приборов в квартире на основе одного из параметров.
// Найти кухонный прибор в квартире, соответствующий заданному диапазону параметров.

package Homework_from_Roman.extra.inheritance.exerciseThreeAppliance;

import Homework_from_Roman.extra.inheritance.exerciseThreeAppliance.eatHeatingDevices.*;
import Homework_from_Roman.extra.inheritance.exerciseThreeAppliance.freezingDevices.*;
import java.util.*;

public class Room {

    public static void main(String[] args) {

        Room main = new Room();
        MicroWave microWave = new MicroWave("MicroWave", 750, 30.0);
        Stove stove = new Stove("Stove", 1500, 55.0);
        Toaster toaster = new Toaster("Toaster", 490, 13.5);
        Freezer freezer = new Freezer("Freezer", 420, 38.0);
        Fridge fridge= new Fridge("Fridge", 200, 73.0);
        fridge.plugIn();
        toaster.plugIn();

        TreeMap<Integer, String> sortPower = new TreeMap<>();
        sortPower.put(microWave.getPower(), microWave.getNameOfAppliance());
        sortPower.put(stove.getPower(), stove.getNameOfAppliance());
        sortPower.put(toaster.getPower(), toaster.getNameOfAppliance());
        sortPower.put(freezer.getPower(), freezer.getNameOfAppliance());
        sortPower.put(fridge.getPower(), fridge.getNameOfAppliance());

        for(Map.Entry<Integer, String> item : sortPower.entrySet()) {
            System.out.println("Мощность: " + item.getKey() + "; Название техники: " + item.getValue());
        }

        SortedMap<Integer, String> setMap = sortPower.subMap(300, 500);
        System.out.println("Кухонные приборы, соответствующие заданному диапазону: " + setMap);

        main.getPowerСonsumption(sortPower);

    }

    public void getPowerСonsumption (TreeMap<?, ?> treemap) {
        Integer sumOfPower = 0;
        Set<Integer> keys = (Set<Integer>) treemap.keySet();
        for(Integer element : keys) {
            sumOfPower += element;
        }
        System.out.println("Потребляемая мощность составляет: " + sumOfPower);

    }

}
