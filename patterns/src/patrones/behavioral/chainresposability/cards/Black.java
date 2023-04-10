package patrones.behavioral.chainresposability.cards;

import patrones.behavioral.chainresposability.ApproveCreditCard;

public class Black implements ApproveCreditCard {

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
        if (quantity > 5000000) {
            System.out.println("Approved Black Card");
        } else {
            next.creditCardRequest(quantity);
        }
    }

}
