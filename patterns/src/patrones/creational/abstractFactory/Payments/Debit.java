package patrones.creational.abstractFactory.Payments;

public class Debit implements Payment {

    @Override
    public String getTypePayment() {
        return "Debit";
    }
}
