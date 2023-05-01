package patternsjava.structural.bridge.payments;

import patternsjava.structural.bridge.ICard;

public class Unsecure implements ICard {
    @Override
    public void makePayment() {
        System.out.println("Payment without Secure");
    }
}
