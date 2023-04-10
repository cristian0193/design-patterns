package patternsjava.creational.factoryMethod.Payments;

public class Debit implements Payment {

    @Override
    public String getTypePayment() {
        return "Debit";
    }
}
