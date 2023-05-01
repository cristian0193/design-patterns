package patternsjava.structural.adapter;

public class CreditCard implements Payment{

    Adapter adapter;

    @Override
    public void Pay(CardsTypes type) {
        if (CardsTypes.CLASSIC.equals(type)) {
            System.out.println("Credit Card Classic: Pay without secure");
        } else if (CardsTypes.BLACK.equals(type)) {
            adapter = new Adapter(CardsTypes.BLACK);
            adapter.Pay(CardsTypes.BLACK);
        } else {
            adapter = new Adapter(CardsTypes.GOLD);
            adapter.Pay(CardsTypes.GOLD);
        }
    }
}
