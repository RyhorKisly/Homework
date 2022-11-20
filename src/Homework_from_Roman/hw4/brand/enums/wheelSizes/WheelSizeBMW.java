package Homework_from_Roman.hw4.brand.enums.wheelSizes;

public enum WheelSizeBMW implements WheelSize{

    SMALL(18),
    MEDIUM(20),
    BIG(22);

    public int size;

    WheelSizeBMW(int size) {
        this.size = size;
    }

}
