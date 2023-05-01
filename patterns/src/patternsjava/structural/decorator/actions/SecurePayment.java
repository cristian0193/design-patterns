package patternsjava.structural.decorator.actions;

import patternsjava.structural.decorator.Credit;
import patternsjava.structural.decorator.Decorator;

public class SecurePayment extends Decorator {
    public SecurePayment(Credit credit) {
        super(credit);
    }

    @Override
    public void showCredit() {
        credit.showCredit();
        config();
    }

    public static void config(){
        System.out.println("Secure Payment Configuration Successful");
    }
}
