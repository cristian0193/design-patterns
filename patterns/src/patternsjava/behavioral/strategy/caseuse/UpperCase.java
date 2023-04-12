package patternsjava.behavioral.strategy.caseuse;

import patternsjava.behavioral.strategy.FormatText;

public class UpperCase implements FormatText {
    @Override
    public void format(String text) {
        System.out.println("Strategy UpperCase: " + text.toUpperCase());
    }
}

