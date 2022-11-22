package Homework_from_Roman.hw4.brand.enums.enumMercedes;

import Homework_from_Roman.hw4.brand.enums.EngineVolume;

public enum EngineVolumeMercedes implements EngineVolume {

    SMALL_VOLUME(1.4),
    MEDIUM_VOLUME(2.4),
    BIG_VOLUME(3.4);

    public double volume;

    EngineVolumeMercedes(double volume) {
        this.volume = volume;
    }

}
