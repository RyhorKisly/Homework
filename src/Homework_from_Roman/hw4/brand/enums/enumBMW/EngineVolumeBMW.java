package Homework_from_Roman.hw4.brand.enums.enumBMW;

import Homework_from_Roman.hw4.brand.enums.EngineVolume;

public enum EngineVolumeBMW implements EngineVolume {

    SMALL_VOLUME(1.2),
    MEDIUM_VOLUME(2.2),
    BIG_VOLUME(4.2);

    public double volume;

    EngineVolumeBMW(double volume) {
        this.volume = volume;
    }

}