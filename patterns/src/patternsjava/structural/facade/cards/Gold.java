package patternsjava.structural.facade.cards;

import patternsjava.structural.facade.Credit;

public class Gold implements Credit {
    @Override
    public void showCredit() {
        System.out.println("Credit Gold: 10.000.000");
    }
}
