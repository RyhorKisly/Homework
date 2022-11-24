package Homework_from_Roman.hw4.enums.enumMercedes;

import Homework_from_Roman.hw4.enums.EngineVolume;

public enum EngineVolumeMercedes implements EngineVolume {

    SMALL_VOLUME(1.4),
    MEDIUM_VOLUME(2.4),
    BIG_VOLUME(3.4);

    private double volume;

    EngineVolumeMercedes(double volume) {
        this.volume = volume;
    }

}
