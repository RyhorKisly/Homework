package Homework_from_Roman.hw4_new.enums.enumAudi;

import Homework_from_Roman.hw4_new.enums.WheelSize;

public enum WheelSizeAudi implements WheelSize {

    VERY_SMALL(16),
    MEDIUM(18);

    private int size;

    WheelSizeAudi(int size) {
        this.size = size;
    }

}
