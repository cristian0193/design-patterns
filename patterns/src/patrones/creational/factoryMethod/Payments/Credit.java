package patrones.creational.factoryMethod.Payments;

public class Credit implements Payment {

    @Override
    public String getTypePayment() {
        return "Credit";
    }
}
