package patrones.creational.prototype.Cards;

import patrones.creational.prototype.PrototypeCard;

public class Visa implements PrototypeCard {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getCard() {
        System.out.println("Visa Card");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Cloning Visa Card ...");
        return (Visa) super.clone();
    }
}
