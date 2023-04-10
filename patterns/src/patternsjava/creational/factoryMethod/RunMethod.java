package patternsjava.creational.factoryMethod;

import patternsjava.creational.factoryMethod.Payments.Payment;
import patternsjava.creational.factoryMethod.Payments.PaymentFactory;

import static patternsjava.creational.factoryMethod.Payments.PaymentType.CREDIT;
import static patternsjava.creational.factoryMethod.Payments.PaymentType.DEBIT;

public class RunMethod {

    public static void runFactoryMethod()  {
        Payment payCredit = PaymentFactory.buildPayment(CREDIT);
        System.out.println(payCredit.getTypePayment());

        Payment payDebit = PaymentFactory.buildPayment(DEBIT);
        System.out.println(payDebit.getTypePayment());
    }

}
