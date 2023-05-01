package patternsjava.creational.factoryMethod;

import patternsjava.creational.factoryMethod.payments.Payment;
import patternsjava.creational.factoryMethod.payments.PaymentFactory;

import static patternsjava.creational.factoryMethod.payments.PaymentType.CREDIT;
import static patternsjava.creational.factoryMethod.payments.PaymentType.DEBIT;

public class RunMethod {

    public static void runFactoryMethod()  {
        Payment payCredit = PaymentFactory.buildPayment(CREDIT);
        System.out.println(payCredit.getTypePayment());

        Payment payDebit = PaymentFactory.buildPayment(DEBIT);
        System.out.println(payDebit.getTypePayment());
    }

}
