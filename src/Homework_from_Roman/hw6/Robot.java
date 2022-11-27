package Homework_from_Roman.hw6;

public enum Robot {

    LEFT_HAND(0), RIGHT_HAND(1),
    LEFT_LEG(2), RIGHT_LEG(3),
    BODY(4),
    HEAD(5);

    private int number;

    Robot(int number) {
        this.number = number;
    }

    public static String getPartOfRobot (int number) {
        for (Robot partOfRobot : values()) {
            if(partOfRobot.number == number) {
                return partOfRobot.name();
            }
        }
        return null;
    }

}
