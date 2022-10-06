// Задание следующее. Нужно зациклить детскую американскую песенку про 99 бутылок пива.

package Head_First;
public class Beers {
    public static void main(String[] args) {

        int beernum = 99;                   // Изменять можно вот это значение)
        int x = beernum;
        String beers = "Bottles of Beer";
        String beer = "Bottle of Beer";

        if (beernum < 0) {
            System.out.println();
            System.out.println("Are you crazy???");
        } else {
            while (beernum == x) {
                while (beernum >= 0) {
                    if (beernum > 2) {
                        System.out.println();
                        System.out.println(beernum + " " + beers + " on the wall");
                        System.out.println(beernum + " " + beers);
                        System.out.println("Take one Down, pass it around");
                        beernum--;
                        System.out.println(beernum + " " + beers + " on the wall!");
                    } else if (beernum == 2) {
                        System.out.println();
                        System.out.println(beernum + " " + beers + " on the wall");
                        System.out.println(beernum + " " + beers);
                        System.out.println("Take one Down, pass it around");
                        beernum--;
                        System.out.println(beernum + " " + beer + " on the wall!");
                    } else if (beernum == 1) {
                        System.out.println();
                        System.out.println(beernum + " " + beer + " on the wall");
                        System.out.println(beernum + " " + beer);
                        System.out.println("Take one Down, pass it around");
                        System.out.println(--beernum + " " + beer + " on the wall!");
                    } else {
                        System.out.println("Give us more beer");
                        beernum = x;
                    }
                    if (x == 0) {
                        --beernum;
                    }
                }
            }
            if (beernum< 0) {
                System.out.println();
                System.out.println("Our bar is closing)");
            }
        }
    }
}