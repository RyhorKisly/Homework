package Homework_from_Roman.inheritance.exerciseSixFlowers;

public class SprayRoses extends Rose{

    private int amountOfBuds;

    public SprayRoses(String name, Color color, int cost, int lifeOfFlowers, int amountOfBuds) {
        super(name, color, cost, lifeOfFlowers);
        this.amountOfBuds = amountOfBuds;
    }

}
