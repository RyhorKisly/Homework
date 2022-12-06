package Homework_from_Roman.hw4.specialOptions;


import Homework_from_Roman.hw4.enums.enumAudi.Transmission;

public class SpecialOptionsAudi implements SpecialOptions{
    private Transmission transmission;

    public SpecialOptionsAudi(Transmission transmission) {
        this.transmission = transmission;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
