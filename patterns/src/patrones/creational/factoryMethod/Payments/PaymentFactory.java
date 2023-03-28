package patrones.creational.factoryMethod.Payments;

public class PaymentFactory {

    public static Payment buildPayment(PaymentType type) {
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
