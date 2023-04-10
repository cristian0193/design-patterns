package patternsjava.behavioral.chainresposability.cards;

import patternsjava.behavioral.chainresposability.ApproveCreditCard;

public class Platinum implements ApproveCreditCard {
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
        if (quantity > 100000 && quantity <= 5000000){
            System.out.println("Approved Platinum Card");
        } else {
            next.creditCardRequest(quantity);
        }
    }


}
