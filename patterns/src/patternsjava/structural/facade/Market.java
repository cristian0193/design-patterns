package patternsjava.structural.facade;

import patternsjava.structural.facade.cards.Black;
import patternsjava.structural.facade.cards.Classic;
import patternsjava.structural.facade.cards.Gold;

public class Market  {

    private Credit classic;
    private Credit gold;
    private Credit black;


    public Market() {
        this.classic = new Classic();
        this.gold = new Gold();
        this.black = new Black();
    }

    public void showCreditClassic(){
        classic.showCredit();
    }

    public void showCreditGold(){
        gold.showCredit();
    }

    public void showCreditBlack(){
        black.showCredit();
    }
}
