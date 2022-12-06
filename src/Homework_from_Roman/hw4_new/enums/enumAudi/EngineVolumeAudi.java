package Homework_from_Roman.hw4_new.enums.enumAudi;

import Homework_from_Roman.hw4_new.enums.EngineVolume;

public enum EngineVolumeAudi implements EngineVolume {

    SMALL_VOLUME(1.6),
    MEDIUM_VOLUME(2.6),
    BIG_VOLUME(3.6);

    private final double volume;

    EngineVolumeAudi(double volume) {
        this.volume = volume;
    }

}
