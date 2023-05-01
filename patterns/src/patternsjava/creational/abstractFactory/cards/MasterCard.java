package patternsjava.creational.abstractFactory.cards;

public class MasterCard implements Card{

    @Override
    public String getTypeCard() {
        return "Paying with MasterCard";
    }
}
