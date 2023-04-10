package patternsjava.creational.prototype;

import patternsjava.creational.prototype.Cards.PrototypeFactory;

import static patternsjava.creational.prototype.CardTypes.MASTERCARD;
import static patternsjava.creational.prototype.CardTypes.VISA;

public class RunMethod {

    public static void runPrototype()  {

        PrototypeFactory.loadCard();

        try {

            PrototypeCard instanceVisa = PrototypeFactory.getInstance(VISA);
            PrototypeCard instanceMastercard = PrototypeFactory.getInstance(MASTERCARD);

            instanceVisa.getCard();
            instanceMastercard.getCard();

        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
    }

}
