package Homework_from_Roman.extra.generic.exerciseFive;

public class Chicken extends Food {

    public Chicken(String name, FoodType foodType) {
        super(name, foodType);
    }

    @Override
    public FoodType getFoodType() {
        return foodType;
    }


}
