package Homework_from_Roman.hw4.enums.enumBMW;

import Homework_from_Roman.hw4.enums.WheelSize;

public enum WheelSizeBMW implements WheelSize {

    SMALL(18),
    BIG(22);

    private int size;

    WheelSizeBMW(int size) {
        this.size = size;
    }

}
