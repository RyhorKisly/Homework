package IT_Academy_Tutorial.exercise33;

public class BankCard {

    private String nameOfBank;
    private String colorOfTheCard;

    public BankCard() {}

    public void withdrawMoney() {
        System.out.println("Снять деньги с карты");
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public String getColorOfTheCard() {
        return colorOfTheCard;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public void setColorOfTheCard(String colorOfTheCard) {
        this.colorOfTheCard = colorOfTheCard;
    }
}
