package patternsjava.creational.abstractFactory.cards;

public class Visa implements Card {

    @Override
    public String getTypeCard() {
        return "Paying with Visa";
    }
}
