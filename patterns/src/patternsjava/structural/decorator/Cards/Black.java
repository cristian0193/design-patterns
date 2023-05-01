package patternsjava.structural.decorator.Cards;

import patternsjava.structural.decorator.Credit;

public class Black implements Credit {
    @Override
    public void showCredit() {
        System.out.println("Credit Black");
    }
}
