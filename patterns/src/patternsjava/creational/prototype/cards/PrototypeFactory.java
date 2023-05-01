package patternsjava.creational.prototype.cards;

import patternsjava.creational.prototype.CardTypes;
import patternsjava.creational.prototype.PrototypeCard;

import java.util.HashMap;
import java.util.Map;

import static patternsjava.creational.prototype.CardTypes.MASTERCARD;
import static patternsjava.creational.prototype.CardTypes.VISA;


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
