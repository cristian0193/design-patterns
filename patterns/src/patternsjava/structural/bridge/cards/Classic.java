package patternsjava.structural.bridge.cards;

import patternsjava.structural.bridge.Card;
import patternsjava.structural.bridge.ICard;

public class Classic extends Card {

    public Classic(ICard card){
        super(card);
    }

    @Override
    public void makePayment() {
        card.makePayment();
    }
}
