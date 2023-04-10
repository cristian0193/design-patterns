package patternsjava.creational.abstractFactory.Cards;

import patternsjava.creational.abstractFactory.AbstractFactory;

public class CardFactory implements AbstractFactory<Card>   {

    final String VISA = "VISA";
    final String MASTERCARD = "MASTERCARD";

    @Override
    public Card create(String type) {
        switch (type) {
            case VISA:
                return new Visa();
            case MASTERCARD:
                return new MasterCard();
            default:
                return null;
        }
    }

}
