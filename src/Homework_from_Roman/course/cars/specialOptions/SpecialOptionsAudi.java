package Homework_from_Roman.course.cars.specialOptions;


import Homework_from_Roman.course.enums.enumAudi.Transmission;

public class SpecialOptionsAudi implements SpecialOptions{
    private Transmission transmission;

    public SpecialOptionsAudi(Transmission transmission) {
        this.transmission = transmission;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
