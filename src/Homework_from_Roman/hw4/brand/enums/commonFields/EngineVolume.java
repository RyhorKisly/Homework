package Homework_from_Roman.hw4.brand.enums.commonFields;

public enum EngineVolume {

    SMALL_VOLUME(1.6),
    MEDIUM_VOLUME(2.0),
    BIG_VOLUME(3.2);

    public double volume;

    EngineVolume(double volume) {
        this.volume = volume;
    }


}
