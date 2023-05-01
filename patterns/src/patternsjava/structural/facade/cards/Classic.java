package patternsjava.structural.facade.cards;

import patternsjava.structural.facade.Credit;

public class Classic implements Credit {
    @Override
    public void showCredit() {
        System.out.println("Credit Classic: 1.000.000");
    }
}
