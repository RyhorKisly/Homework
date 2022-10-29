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

    public void printNextSeason(Seasons season) {
        this.season = season;
        int i = 0;
        int count = 0;
        String temp = null;
        for(Seasons element : Seasons.values()) {
            if(count == 0) {
                temp = element.name();
            }
            if(i == 1) {
                System.out.println(element.name());
                break;
            }
            if(count == season.values().length - 1) {
                System.out.println(temp);
                break;
            }
            if(element == season) {
                i++;
            }
            count++;
        }
    }

    public void printCountOfDays(Seasons season) {
        this.season = season;
        System.out.println(season.getCountOfDays());
    }

}
