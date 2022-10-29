package IT_Academy_Tutorial.exercise35_36_37;

public enum Seasons {

    WINTER("December, January, February, ", 90),
    SPRING("March, April, May, ", 92),
    SUMMER("June, July, August, ", 92),
    AUTUMN("September, October, November, ", 91);

    private String description;
    private int countOfDays;

    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }
}
