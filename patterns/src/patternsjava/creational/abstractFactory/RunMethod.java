package patternsjava.creational.abstractFactory;


import patternsjava.creational.abstractFactory.cards.Card;
import patternsjava.creational.abstractFactory.payments.Payment;


import static patternsjava.creational.abstractFactory.cards.CardType.MASTERCARD;
import static patternsjava.creational.abstractFactory.cards.CardType.VISA;
import static patternsjava.creational.abstractFactory.payments.PaymentType.CREDIT;
import static patternsjava.creational.abstractFactory.payments.PaymentType.DEBIT;
import static patternsjava.creational.abstractFactory.PurchaseType.CARD;
import static patternsjava.creational.abstractFactory.PurchaseType.PAYMENT;

public class RunMethod {

    public static void runAbstractFactory() {
        AbstractFactory cardFactory = FactoryProvider.getFactory(CARD);
        AbstractFactory paymentFactory = FactoryProvider.getFactory(PAYMENT);

        Card card = (Card) cardFactory.create(VISA.name());
        Payment payment = (Payment) paymentFactory.create(DEBIT.name());

        System.out.println(card.getTypeCard().concat(" : ").concat(payment.getTypePayment()));

        /*---------------------------------------------------------------------------*/

        Card card2 = (Card) cardFactory.create(MASTERCARD.name());
        Payment payment2 = (Payment) paymentFactory.create(CREDIT.name());

        System.out.println(card2.getTypeCard().concat(" : ").concat(payment2.getTypePayment()));
    }

}
