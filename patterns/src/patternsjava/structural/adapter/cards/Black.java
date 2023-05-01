package patternsjava.structural.adapter.cards;

import patternsjava.structural.adapter.Secure;

public class Black implements Secure {

    @Override
    public void SecureLevelA() {
        System.out.println("Credit Card Black: Level A");
    }

    @Override
    public void SecureLevelZ() {
        // No Implementation
    }
}
