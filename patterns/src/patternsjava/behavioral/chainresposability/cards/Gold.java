package patternsjava.behavioral.chainresposability.cards;

import patternsjava.behavioral.chainresposability.ApproveCreditCard;

public class Gold implements ApproveCreditCard {

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
        if (quantity <= 100000){
            System.out.println("Approved Gold Card");
        } else {
            next.creditCardRequest(quantity);
        }
    }
}
