package patrones.creational.prototype.Cards;

import patrones.creational.prototype.PrototypeCard;

public class Mastercard implements PrototypeCard {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void getCard() {
        System.out.println("Mastercard Card");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Cloning Mastercard Card ...");
        return (Mastercard) super.clone();
    }
}
