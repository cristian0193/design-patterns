package patternsjava.structural.bridge.payments;

import patternsjava.structural.bridge.ICard;

public class Secure implements ICard {
    @Override
    public void makePayment() {
        System.out.println("Payment with Secure");
    }
}
