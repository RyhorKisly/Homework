package IT_Academy_Tutorial.exercise35_36_37;


public class TestSeasons {

    Seasons season;

    public static void main(String[] args) {

        TestSeasons seasons = new TestSeasons();
        seasons.printSeasons();
        System.out.println();
        seasons.printNextSeason(Seasons.WINTER);
        seasons.printNextSeason(Seasons.SPRING);
        seasons.printNextSeason(Seasons.SUMMER);
        seasons.printNextSeason(Seasons.AUTUMN);
        System.out.println();
        seasons.printCountOfDays(Seasons.SPRING);

    }

    public void printSeasons() {
        for(Seasons element : Seasons.values()) {
            System.out.println(element.name());
        }
    }

    public Seasons printNextSeason(Seasons season) {
        if(season.ordinal() == season.values().length - 1) {
            return season.values()[0];
        } else{
            return season.values()[season.ordinal() + 1];
        }
    }

    public void printCountOfDays(Seasons season) {
        this.season = season;
        System.out.println(season.getCountOfDays());
    }

}
