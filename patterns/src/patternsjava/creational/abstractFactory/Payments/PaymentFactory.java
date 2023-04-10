package patternsjava.creational.abstractFactory.Payments;

import patternsjava.creational.abstractFactory.AbstractFactory;

public class PaymentFactory implements AbstractFactory<Payment>  {

    final String DEBIT = "DEBIT";
    final String CREDIT = "CREDIT";

    @Override
    public Payment create(String type) {
        switch (type) {
            case DEBIT:
                return new Debit();
            case CREDIT:
                return new Credit();
            default:
                return null;
        }
    }

}
