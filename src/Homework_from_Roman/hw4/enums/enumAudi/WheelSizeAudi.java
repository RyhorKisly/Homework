package Homework_from_Roman.hw4.enums.enumAudi;

import Homework_from_Roman.hw4.enums.WheelSize;

public enum WheelSizeAudi implements WheelSize {

    SMALL(16),
    MEDIUM(18),
    BIG(20);

    private int size;

    WheelSizeAudi(int size) {
        this.size = size;
    }

}
