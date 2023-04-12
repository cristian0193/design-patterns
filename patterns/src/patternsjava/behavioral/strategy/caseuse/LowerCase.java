package patternsjava.behavioral.strategy.caseuse;

import patternsjava.behavioral.strategy.FormatText;

public class LowerCase implements FormatText {
    @Override
    public void format(String text) {
        System.out.println("Strategy LowerCase: " + text.toLowerCase());
    }
}
