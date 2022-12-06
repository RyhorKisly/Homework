package Homework_from_Roman.hw4_new.specialOptions;


import Homework_from_Roman.hw4_new.enums.enumAudi.Transmission;

public class SpecialOptionsAudi implements SpecialOptions{
    private Transmission transmission;

    public SpecialOptionsAudi(Transmission transmission) {
        this.transmission = transmission;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
