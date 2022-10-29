package Homework_from_Roman.inheritance.exerciseThree;

public class Appliancable {

    public String nameOfAppliance;
    private Integer power;
    private Double weight;

    public Appliancable(String nameOfAppliance, Integer power, Double weight) {
        this.nameOfAppliance = nameOfAppliance;
        this.power = power;
        this.weight = weight;
    }

    public void plugIn() {
        System.out.println("Включить в разетку " + this.nameOfAppliance);
    }

    public String getNameOfAppliance() {
        return nameOfAppliance;
    }

    public void setNameOfAppliance(String nameOfAppliance) {
        this.nameOfAppliance = nameOfAppliance;
    }

    public Integer getPower() {
        return power;
    }

    public Integer setPower(int power) {
        this.power = power;
        return power;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
