package patrones.creational.abstractFactory.Cards;

public class MasterCard implements Card{

    @Override
    public String getTypeCard() {
        return "Paying with MasterCard";
    }
}
