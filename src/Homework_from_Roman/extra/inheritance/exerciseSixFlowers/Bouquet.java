package Homework_from_Roman.extra.inheritance.exerciseSixFlowers;

import java.util.HashSet;
import java.util.Set;

public class Bouquet {

    Flower[] flower;

//        Собрать букет
    public Bouquet(Flower... flower) {
        this.flower = flower;
    }

    //        Oпределить стоимость букета.
    public int sumOfCost() {
        int sumOfCost = 0;
        for(Flower element : flower) {
            sumOfCost += element.getCost();
        }
        return sumOfCost;
    }

//        Определить все цвета, используемые в букете.
    public void fullSetOfColors() {
        System.out.println("В букете есть цветы со следующими цветами: ");
        Set<String> fullSetOfColors = new HashSet<>();
        for(Flower element : flower) {
            fullSetOfColors.add(String.valueOf(element.getColor()));
        }
        for(String element : fullSetOfColors){

            System.out.println(element);
        }
    }

//        Определить когда весь букет завянет.
    public void dateOfDeath() {
        int dateOfDeath = 0;
        for(Flower element : flower) {
            if (dateOfDeath < element.getLifeOfFlowers()) {
                dateOfDeath = element.getLifeOfFlowers();
            }
        }
        System.out.println("Весь букет завянет через: " + dateOfDeath + " дней(я)");
    }

}
