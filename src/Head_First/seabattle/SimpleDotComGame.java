package Head_First.seabattle;

import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();
        DotCom theDotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);

        ArrayList<String> location = new ArrayList<>();
        location.add(String.valueOf(randomNum));
        location.add(String.valueOf(randomNum + 1));
        location.add(String.valueOf(randomNum + 2));
        theDotCom.setLocationCells(location);

        boolean isAlive = true;


        while(isAlive == true) {
            String guess = helper.getUserInput("Введите число");

            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }

        }
    }
}
