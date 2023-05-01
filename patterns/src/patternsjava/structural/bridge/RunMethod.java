package patternsjava.structural.bridge;

import patternsjava.structural.bridge.cards.Classic;
import patternsjava.structural.bridge.payments.Secure;
import patternsjava.structural.bridge.payments.Unsecure;

public class RunMethod {

    public static void runBridge(){
        Card secure = new Classic(new Secure());
        secure.makePayment();

        Card unsecure = new Classic(new Unsecure());
        unsecure.makePayment();
    }

}
