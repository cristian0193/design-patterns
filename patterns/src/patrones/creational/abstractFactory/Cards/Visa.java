package patrones.creational.abstractFactory.Cards;

public class Visa implements Card {

    @Override
    public String getTypeCard() {
        return "Paying with Visa";
    }
}
