package IT_Academy_Tutorial.exercise33;

public class CardPlatinum extends CardGold{

    public CardPlatinum(String nameOfBank, String levelOfCard) {
        super(nameOfBank, levelOfCard);
    }

    public void withdrawMoney(int sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
        if (sumOfMoney <= 10000) {
            System.out.println("Снять деньги с карты");
        } else {
            System.out.println("Слишком большая сумма");
        }
    }

}