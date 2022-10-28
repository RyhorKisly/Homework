package IT_Academy_Tutorial.exercise33;

public class CardClassic extends BankCard {

    String nameOfBank;
    String levelOfCard;

    int sumOfMoney = 1;

    public CardClassic(String nameOfBank, String levelOfCard) {
        super();
        this.nameOfBank = nameOfBank;
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
