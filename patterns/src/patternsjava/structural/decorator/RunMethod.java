package patternsjava.structural.decorator;

import patternsjava.structural.decorator.cards.Black;
import patternsjava.structural.decorator.cards.Gold;
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
