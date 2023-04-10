package patrones.behavioral.chainresposability;

import patrones.behavioral.chainresposability.cards.Black;
import patrones.behavioral.chainresposability.cards.Gold;
import patrones.behavioral.chainresposability.cards.Platinum;

public class Card implements ApproveCreditCard {

    private ApproveCreditCard next;

    @Override
    public void setNext(ApproveCreditCard approveCreditCard) {
        next = approveCreditCard;
    }

    @Override
    public ApproveCreditCard getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int quantity) {
        Gold gold = new Gold();
        this.setNext(gold);

        Platinum platinum = new Platinum();
        gold.setNext(platinum);

        Black black = new Black();
        platinum.setNext(black);

        next.creditCardRequest(quantity);
    }
}
