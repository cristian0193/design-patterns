package patternsjava.structural.facade;

import patternsjava.structural.decorator.Cards.Black;
import patternsjava.structural.decorator.Cards.Gold;
import patternsjava.structural.decorator.Credit;
import patternsjava.structural.decorator.actions.InternationalPayment;
import patternsjava.structural.decorator.actions.SecurePayment;

public class RunMethod {

    public static void runFacade(){
        Market market = new Market();
        market.showCreditClassic();
        market.showCreditGold();
        market.showCreditBlack();

    }

}
