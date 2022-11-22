package Homework_from_Roman.hw4Two.brand.enums.enumMercedes;

import Homework_from_Roman.hw4Two.brand.enums.WheelSize;

public enum WheelSizeMercedes implements WheelSize {

    SMALL(20),
    MEDIUM(22),
    BIG(24);

    public int size;

    WheelSizeMercedes(int size) {
        this.size = size;
    }

}
