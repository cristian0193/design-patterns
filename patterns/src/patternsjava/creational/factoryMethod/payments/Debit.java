package patternsjava.creational.factoryMethod.payments;

public class Debit implements Payment {

    @Override
    public String getTypePayment() {
        return "Debit";
    }
}
