package patrones.creational.prototype;

import patrones.creational.prototype.Cards.PrototypeFactory;

import static patrones.creational.prototype.CardTypes.MASTERCARD;
import static patrones.creational.prototype.CardTypes.VISA;

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
