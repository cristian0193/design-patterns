package patrones.creational.abstractFactory;


import patrones.creational.abstractFactory.Cards.Card;
import patrones.creational.abstractFactory.Payments.Payment;


import static patrones.creational.abstractFactory.Cards.CardType.MASTERCARD;
import static patrones.creational.abstractFactory.Cards.CardType.VISA;
import static patrones.creational.abstractFactory.Payments.PaymentType.CREDIT;
import static patrones.creational.abstractFactory.Payments.PaymentType.DEBIT;
import static patrones.creational.abstractFactory.PurchaseType.CARD;
import static patrones.creational.abstractFactory.PurchaseType.PAYMENT;

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
