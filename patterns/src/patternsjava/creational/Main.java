package patternsjava.creational;

import static patternsjava.creational.PatternCreationalTypes.*;
import static patternsjava.creational.abstractFactory.RunMethod.runAbstractFactory;
import static patternsjava.creational.builder.RunMethod.runBuilder;
import static patternsjava.creational.factoryMethod.RunMethod.runFactoryMethod;
import static patternsjava.creational.prototype.RunMethod.runPrototype;
import static patternsjava.creational.singleton.RunMethod.runSingleton;


public class Main {

    public static void main(String[] args) {

    // 1. Factory Method
    separator(FACTORY_METHOD);
    runFactoryMethod();

    // 2. Abstract Factory
    separator(ABSTRACT_FACTORY);
    runAbstractFactory();

    // 3. Builder
    separator(BUILDER);
    runBuilder();

    // 4. Prototype
    separator(PROTOTYPE);
    runPrototype();

    // 5. Singleton
    separator(SINGLETON);
    runSingleton();

}

    public static void separator(PatternCreationalTypes pattern){
        System.out.println("---------------------------------------\n");
        System.out.println(pattern);
    }

}
