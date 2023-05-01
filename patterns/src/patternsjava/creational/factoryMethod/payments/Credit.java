package patternsjava.creational.factoryMethod.payments;

public class Credit implements Payment {

    @Override
    public String getTypePayment() {
        return "Credit";
    }
}
