package patrones.creational.prototype.Cards;

import patrones.creational.prototype.CardTypes;
import patrones.creational.prototype.PrototypeCard;

import java.util.HashMap;
import java.util.Map;

import static patrones.creational.prototype.CardTypes.MASTERCARD;
import static patrones.creational.prototype.CardTypes.VISA;


public class PrototypeFactory {

    private static Map<CardTypes, PrototypeCard> prototypes = new HashMap<>();

    public static PrototypeCard getInstance(CardTypes type) throws CloneNotSupportedException{
        return prototypes.get(type).clone();
    }

    public static void loadCard(){
        Visa visa = new Visa();
        visa.setName("Card Visa 000 111 222 333");

        Mastercard mastercard = new Mastercard();
        mastercard.setName("Card MasterCard 000 111 222 333");

        prototypes.put(VISA, visa);
        prototypes.put(MASTERCARD, mastercard);
    }


}
