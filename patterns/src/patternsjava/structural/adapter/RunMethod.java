package patternsjava.structural.adapter;

public class RunMethod {

    public static void runAdapter(){
        CreditCard adapterClassic = new CreditCard();
        adapterClassic.Pay(CardsTypes.CLASSIC);

        CreditCard adapterBlack = new CreditCard();
        adapterBlack.Pay(CardsTypes.BLACK);

        CreditCard adapterGold= new CreditCard();
        adapterGold.Pay(CardsTypes.GOLD);
    }

}
