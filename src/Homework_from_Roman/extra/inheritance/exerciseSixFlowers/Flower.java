package Homework_from_Roman.extra.inheritance.exerciseSixFlowers;

public class Flower {

    private String name;
    private Color color;
    private int cost;
    private int lifeOfFlowers;

    public Flower(String name, Color color, int cost, int lifeOfFlowers) {
        this.name = name;
        this.color = color;
        this. cost = cost;
        this.lifeOfFlowers = lifeOfFlowers;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCost(int Cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public int getLifeOfFlowers() {
        return lifeOfFlowers;
    }

    public void setLifeOfFlowers(int lifeOfFlowers) {
        this.lifeOfFlowers = lifeOfFlowers;
    }
}
