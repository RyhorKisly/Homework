package Homework_from_Roman.hw4Two.brand.enums.enumBMW;

import Homework_from_Roman.hw4Two.brand.enums.WheelSize;

public enum WheelSizeBMW implements WheelSize {

    SMALL(18),
    MEDIUM(20),
    BIG(22);

    public int size;

    WheelSizeBMW(int size) {
        this.size = size;
    }

}
