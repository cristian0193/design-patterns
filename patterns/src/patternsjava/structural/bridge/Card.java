package patternsjava.structural.bridge;

public abstract class Card {

    protected ICard card;

    protected Card(ICard card){
        this.card = card;
    }

    public abstract void makePayment();

}
