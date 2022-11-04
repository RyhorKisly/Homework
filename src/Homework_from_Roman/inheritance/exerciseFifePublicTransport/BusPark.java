//        Создать парк ОТ

package Homework_from_Roman.inheritance.exerciseFifePublicTransport;

import Homework_from_Roman.inheritance.exerciseFourAirline.AirVehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BusPark {

        private PublicTransport[] publicTransport;


        public BusPark(PublicTransport... publicTransport) {
            this.publicTransport = publicTransport;
        }

//    Рассчитать стоимость автопарка.
    public int costAutoPark() {
            int sumOfCost = 0;
            for(PublicTransport element : publicTransport) {
                sumOfCost += element.getCost();
            }
            return sumOfCost;
    }

//    Провести сортировку машин парка по расходу топлива.
    public void sortByFuelConsumption() {
        Arrays.sort(publicTransport);
        for(PublicTransport element : publicTransport) {
            System.out.println(element.getName() + ", имеет следующий расход топлива: " +
                    element.getFuelConsumption() + " л. на 100км.");
        }
    }

//    Найти автобус в компании, соответствующий заданному диапазону параметров.
    public void findTransportCorrespondingToLoadCapacity(int firstValue, int lastValue) {
        try {
            int i = 0;
            Pattern p = Pattern.compile("Автобус");
            Arrays.sort(publicTransport);
            System.out.println("Автобусы, соответствующие заданному диапазоны:");
            for(PublicTransport  element : publicTransport){
                Matcher m = p.matcher(element.getName());
                if (firstValue <= element.getCost() && lastValue >= element.getCost() && m.find()) {
                    System.out.println(element.getName() + ", " + "стоимость: " + element.getCost() + " $");
                    i++;
                }
            }
            if(i == 0) {
                throw new Exception("Нет Автобусов, соответствующих заданному параметру");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

}
