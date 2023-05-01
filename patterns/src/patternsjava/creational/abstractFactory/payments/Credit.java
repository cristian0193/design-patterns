package patternsjava.creational.abstractFactory.payments;

public class Credit implements Payment{

    @Override
    public String getTypePayment() {
        return "Credit";
    }
}
