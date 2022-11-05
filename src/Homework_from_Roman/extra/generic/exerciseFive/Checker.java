//        * Создать отдельный класс с методом проверк boolean isVegetarian(Food[] foods).
//        В метод передаётся набор ингредиентов, на выходе true, если все они вегетарианские.

package Homework_from_Roman.extra.generic.exerciseFive;

public class Checker {

    boolean isVegetarian(Food[] foods) {
        boolean vegetarian = true;
        boolean meatEater = true;
        for(Food element : foods) {
            if(element.getFoodType() == FoodType.FRUIT ||
                    element.getFoodType() == FoodType.VEGETABLE ||
                    element.getFoodType() == FoodType.MILK) {
                vegetarian = true;
            } else {
                meatEater = false;
            }
        }

        System.out.println(meatEater);
        return meatEater;
    }


}
