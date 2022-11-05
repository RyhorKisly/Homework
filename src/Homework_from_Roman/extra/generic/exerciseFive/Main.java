//        Создать enum - FoodType (MEAT, FISH, FRUIT, VEGETABLE, MILK, UNKNOWN)
//        Создать базовый абстрактный класс Food и в нем абстрактный метод
//        public FoodType getFoodType();
//        * Создать 2-3 класса наследника Food и реализовать методы get/set name,
//        a также переопределить getFoodType для каждого.
//        * Создать отдельный класс с методом проверк boolean isVegetarian(Food[] foods)
//        в метод передается набор ингредиентов, на выходе true если все они вегетарианские

package Homework_from_Roman.extra.generic.exerciseFive;

public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple("Apple", FoodType.FRUIT);
        Chicken chicken = new Chicken("Chicken", FoodType.MEAT);
        Potato potato = new Potato("Potato", FoodType.VEGETABLE);

        Food[] foods = {apple, chicken, potato};

        Checker check = new Checker();
        check.isVegetarian(foods);

    }

}
