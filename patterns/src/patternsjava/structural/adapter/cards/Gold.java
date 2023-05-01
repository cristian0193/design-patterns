package patternsjava.structural.adapter.cards;

import patternsjava.structural.adapter.CardsTypes;
import patternsjava.structural.adapter.Secure;

public class Gold implements Secure {
    @Override
    public void SecureLevelA() {
        // No Implementation
    }

    @Override
    public void SecureLevelZ() {
        System.out.println("Credit Card Gold: Level Z");
    }
}
