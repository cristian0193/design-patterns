package patternsjava.creational.abstractFactory.payments;

public class Debit implements Payment {

    @Override
    public String getTypePayment() {
        return "Debit";
    }
}
