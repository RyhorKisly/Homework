package Homework_from_Roman.hw4.enums.enumBMW;

import Homework_from_Roman.hw4.enums.EngineVolume;

public enum EngineVolumeBMW implements EngineVolume {

    SMALL_VOLUME(1.2),
    MEDIUM_VOLUME(2.2),
    BIG_VOLUME(4.2);

    private double volume;

    EngineVolumeBMW(double volume) {
        this.volume = volume;
    }

}
