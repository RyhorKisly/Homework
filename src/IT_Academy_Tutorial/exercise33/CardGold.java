package IT_Academy_Tutorial.exercise33;

public class CardGold extends CardClassic{

    public CardGold(String nameOfBank, String colorOfTheCard, String levelOfCard) {
        super(nameOfBank, colorOfTheCard, levelOfCard);
    }


    public void withdrawMoney(int sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
        if (sumOfMoney <= 5000) {
            System.out.println("Снять деньги с карты");
        } else {
            System.out.println("Слишком большая сумма");
        }
    }

}
