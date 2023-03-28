package patrones.creational.factoryMethod;

import patrones.creational.factoryMethod.Payments.Payment;
import patrones.creational.factoryMethod.Payments.PaymentFactory;

import static patrones.creational.factoryMethod.Payments.PaymentType.CREDIT;
import static patrones.creational.factoryMethod.Payments.PaymentType.DEBIT;

public class RunMethod {

    public static void runFactoryMethod()  {
        Payment payCredit = PaymentFactory.buildPayment(CREDIT);
        System.out.println(payCredit.getTypePayment());

        Payment payDebit = PaymentFactory.buildPayment(DEBIT);
        System.out.println(payDebit.getTypePayment());
    }

}
