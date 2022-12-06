package Homework_from_Roman.course.enums.enumAudi;

import Homework_from_Roman.course.enums.WheelSize;

public enum WheelSizeAudi implements WheelSize {

    VERY_SMALL(16),
    MEDIUM(18);

    private int size;

    WheelSizeAudi(int size) {
        this.size = size;
    }

}
