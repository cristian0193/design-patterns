package patrones.creational.abstractFactory.Payments;

public class Credit implements Payment{

    @Override
    public String getTypePayment() {
        return "Credit";
    }
}
