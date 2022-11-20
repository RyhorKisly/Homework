package Homework_from_Roman.hw4.brand.enums.engineVolumes;

public enum EngineVolumeAudi implements EngineVolume{

    SMALL_VOLUME(1.6),
    MEDIUM_VOLUME(2.6),
    BIG_VOLUME(3.6);

    public double volume;

    EngineVolumeAudi(double volume) {
        this.volume = volume;
    }

}
