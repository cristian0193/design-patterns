package patternsjava.creational.abstractFactory;

import patternsjava.creational.abstractFactory.Cards.CardFactory;
import patternsjava.creational.abstractFactory.Payments.PaymentFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(PurchaseType chooseFactory) {
        switch (chooseFactory) {
            case CARD:
                return new CardFactory();
            case PAYMENT:
                return new PaymentFactory();
            default:
                return null;
        }
    }

}
