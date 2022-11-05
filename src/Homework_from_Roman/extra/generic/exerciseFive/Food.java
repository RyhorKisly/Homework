package Homework_from_Roman.extra.generic.exerciseFive;

public abstract class Food {
    private String name;
    FoodType foodType;

    public Food(String name, FoodType foodType) {
        this.name = name;
        this.foodType = foodType;
    }

    public abstract FoodType getFoodType();

}
