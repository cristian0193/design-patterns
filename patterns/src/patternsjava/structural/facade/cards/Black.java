package patternsjava.structural.facade.cards;

import patternsjava.structural.facade.Credit;

public class Black implements Credit {
    @Override
    public void showCredit() {
        System.out.println("Credit Black: 100.000.000");
    }
}