package Homework_from_Roman.course.enums.enumMercedes;

import Homework_from_Roman.course.enums.WheelSize;

public enum WheelSizeMercedes implements WheelSize {

    SMALLEST(14),
    VERY_BIG(24);

    private int size;

    WheelSizeMercedes(int size) {
        this.size = size;
    }

}
