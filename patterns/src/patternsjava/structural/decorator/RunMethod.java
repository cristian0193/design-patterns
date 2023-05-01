package patternsjava.structural.decorator;

import patternsjava.structural.composite.Component;
import patternsjava.structural.composite.Composite;
import patternsjava.structural.composite.accounts.Current;
import patternsjava.structural.composite.accounts.Savings;
import patternsjava.structural.decorator.Cards.Black;
import patternsjava.structural.decorator.Cards.Gold;
import patternsjava.structural.decorator.actions.InternationalPayment;
import patternsjava.structural.decorator.actions.SecurePayment;

public class RunMethod {

    public static void runDecorator(){

        Credit gold1 = new Gold();

        Credit black1 = new Black();
        black1 = new InternationalPayment(black1);

        Credit gold2 = new Gold();
        gold2 = new SecurePayment(gold2);
        gold2 = new InternationalPayment(gold2);

        gold1.showCredit();
        black1.showCredit();
        gold2.showCredit();

    }

}
