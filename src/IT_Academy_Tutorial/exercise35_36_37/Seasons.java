package IT_Academy_Tutorial.exercise35_36_37;

public enum Seasons {

    WINTER( 89, 90),
    SPRING( 92),
    SUMMER(92),
    AUTUMN(91);

    private String description;
    private int countOfDays;
    private int countOfDaysTwo;

    Seasons(int countOfDays) {
        this.countOfDays = countOfDays;

    }

    Seasons(int countOfDays, int countOfDaysTow) {
        this.countOfDays = countOfDays;
        this.countOfDaysTwo = countOfDaysTwo;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }
}
