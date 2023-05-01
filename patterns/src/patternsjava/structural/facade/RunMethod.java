package patternsjava.structural.facade;

public class RunMethod {

    public static void runFacade(){
        Market market = new Market();
        market.showCreditClassic();
        market.showCreditGold();
        market.showCreditBlack();

    }

}
