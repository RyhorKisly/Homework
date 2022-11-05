package Homework_from_Roman.extra.generic.exerciseFive;

public class Potato extends Food {

    public Potato(String name, FoodType foodType) {
        super(name, foodType);
    }

    @Override
    public FoodType getFoodType() {
        return foodType;
    }
}
