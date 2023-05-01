package patternsjava.structural;

import static patternsjava.structural.PatternStructuralTypes.*;
import static patternsjava.structural.adapter.RunMethod.runAdapter;
import static patternsjava.structural.bridge.RunMethod.runBridge;
import static patternsjava.structural.composite.RunMethod.runComposite;
import static patternsjava.structural.decorator.RunMethod.runDecorator;
import static patternsjava.structural.facade.RunMethod.runFacade;
import static patternsjava.structural.flyweight.RunMethod.runFlyweight;
import static patternsjava.structural.proxy.RunMethod.runProxy;

public class Main {

    public static void main(String[] args) {

        // 1. Adapter
        separator(ADAPTER);
        runAdapter();

        // 2. Bridge
        separator(BRIDGE);
        runBridge();

        // 3. Composite
        separator(COMPOSITE);
        runComposite();

        // 4. Decorator
        separator(DECORATOR);
        runDecorator();

        // 5. Facade
        separator(FACADE);
        runFacade();

        // 6. Flyweight
        separator(FLYWEIGHT);
        runFlyweight();

        // 7. Proxy
        separator(PROXY);
        runProxy();
    }

    public static void separator(PatternStructuralTypes pattern){
        System.out.println("---------------------------------------\n");
        System.out.println(pattern);
    }


}
