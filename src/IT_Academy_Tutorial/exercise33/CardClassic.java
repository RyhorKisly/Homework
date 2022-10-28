package IT_Academy_Tutorial.exercise33;

public class CardClassic extends BankCard {

    private String nameOfBank;
    private String colorOfTheCard;
    private String levelOfCard;

    int sumOfMoney = 1;

    public CardClassic(String nameOfBank, String colorOfTheCard, String levelOfCard) {
        this.nameOfBank = nameOfBank;
        this.colorOfTheCard = colorOfTheCard;
        this.levelOfCard = levelOfCard;
    }

    public void withdrawMoney(int sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
        if (sumOfMoney <= 1000) {
            System.out.println("Снять деньги с карты");
        } else {
            System.out.println("Слишком большая сумма");
        }
    }
}

