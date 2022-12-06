package Homework_from_Roman.hw4_new.enums.enumMercedes;

import Homework_from_Roman.hw4_new.enums.WheelSize;

public enum WheelSizeMercedes implements WheelSize {

    SMALLEST(14),
    VERY_BIG(24);

    private int size;

    WheelSizeMercedes(int size) {
        this.size = size;
    }

}
