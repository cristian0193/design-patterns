package patternsjava.creational.singleton;

import static java.util.Objects.isNull;

public class Card {

    public static Card INSTANCE;

    private String numberCard;

    public Card() {}

    public static Card getInstance(){
       return (isNull(INSTANCE)) ? new Card() : INSTANCE;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }
}
