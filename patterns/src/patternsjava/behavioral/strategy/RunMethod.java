package patternsjava.behavioral.strategy;

import patternsjava.behavioral.strategy.caseuse.LowerCase;
import patternsjava.behavioral.strategy.caseuse.UpperCase;

public class RunMethod {

    public static void runStrategy(){
        Context context1 = new Context(new LowerCase());
        context1.publisherStrategy("Hello");

        Context context2 = new Context(new UpperCase());
        context2.publisherStrategy("Hello");
    }

}
