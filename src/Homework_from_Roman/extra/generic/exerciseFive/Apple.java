package Homework_from_Roman.extra.generic.exerciseFive;

public class Apple extends Food {

    public Apple(String name, FoodType foodType) {
        super(name, foodType);
    }

    @Override
    public FoodType getFoodType() {
        return foodType;
    }


}
